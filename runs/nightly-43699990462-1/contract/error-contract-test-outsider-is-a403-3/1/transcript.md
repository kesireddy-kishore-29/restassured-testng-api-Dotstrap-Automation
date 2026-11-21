# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-529b961f-7cf8-4e1e-91e5-688e06b158e9` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-735adbbc-32a7-4063-ad9d-4441b3413e21` |
| 3 | `POST /v1/accounts` | 201 | 51 | `qa-ad8cc556-e471-47bf-af05-20f84985083d` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-ce2300ac-d1f1-4a00-9e8f-4ace5693ea3d` |
| 5 | `POST /v1/conversations` | 201 | 3 | `qa-dc9b9f56-493d-400c-aba8-a7461b790ca4` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-5857ee78-c9ae-4c0a-8f4b-eff8cc77df7b` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 11 | `qa-f57893a8-9481-44d1-93a1-e1bed7d95a20` |
| 8 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-41c1f131-b80c-47ff-a216-c14a96ad5ba8` |
| 9 | `POST /v1/auth/token` | 401 | 48 | `qa-c97d1cf5-8ae2-44f1-9bd4-29a80bfa55b4` |
| 10 | `POST /v1/auth/token` | 200 | 26 | `qa-09fe472e-7bbb-4b4f-8acc-9b7b99a19864` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ba652f49-c37a-4795-aecc-83ac276e6f15` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-7e8c3777-653f-459c-9d3a-720208b44a87` |
| 13 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-c6cc6cd7-1cb7-4d7a-b93a-1851321b192a` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-416a205a-2e1a-46e3-9fb8-32a73d43dea9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-529b961f-7cf8-4e1e-91e5-688e06b158e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-529b961f-7cf8-4e1e-91e5-688e06b158e9
Content-Type: application/json

--- request body ---
{"handle":"qa-3a0dd0975772","displayName":"QA 3a0dd0975772","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-529b961f-7cf8-4e1e-91e5-688e06b158e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-3a0dd0975772
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24d8baf5-b2eb-4091-82c0-bb60986ce2b9","handle":"qa-3a0dd0975772","displayName":"QA 3a0dd0975772","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.271379502Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-735adbbc-32a7-4063-ad9d-4441b3413e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-735adbbc-32a7-4063-ad9d-4441b3413e21
Content-Type: application/json

--- request body ---
{"handle":"qa-55d8eacdaf6d","displayName":"QA 55d8eacdaf6d","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-735adbbc-32a7-4063-ad9d-4441b3413e21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-55d8eacdaf6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc83897c-b9a1-4017-aada-aae513914eee","handle":"qa-55d8eacdaf6d","displayName":"QA 55d8eacdaf6d","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.299498514Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-ad8cc556-e471-47bf-af05-20f84985083d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad8cc556-e471-47bf-af05-20f84985083d
Content-Type: application/json

--- request body ---
{"handle":"qa-7230eceec8c6","displayName":"QA 7230eceec8c6","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad8cc556-e471-47bf-af05-20f84985083d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Location: /v1/accounts/qa-7230eceec8c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15b0ed11-9696-4594-9c95-22dfe4206778","handle":"qa-7230eceec8c6","displayName":"QA 7230eceec8c6","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.346319982Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ce2300ac-d1f1-4a00-9e8f-4ace5693ea3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce2300ac-d1f1-4a00-9e8f-4ace5693ea3d
Content-Type: application/json

--- request body ---
{"handle":"qa-3a0dd0975772","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce2300ac-d1f1-4a00-9e8f-4ace5693ea3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24d8baf5-b2eb-4091-82c0-bb60986ce2b9"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-dc9b9f56-493d-400c-aba8-a7461b790ca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc9b9f56-493d-400c-aba8-a7461b790ca4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-55d8eacdaf6d","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc9b9f56-493d-400c-aba8-a7461b790ca4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_28369dc0-5113-43eb-a0cd-45ad496b5021
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_28369dc0-5113-43eb-a0cd-45ad496b5021","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a0dd0975772","qa-55d8eacdaf6d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.396540132Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5857ee78-c9ae-4c0a-8f4b-eff8cc77df7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5857ee78-c9ae-4c0a-8f4b-eff8cc77df7b
Content-Type: application/json

--- request body ---
{"handle":"qa-7230eceec8c6","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5857ee78-c9ae-4c0a-8f4b-eff8cc77df7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15b0ed11-9696-4594-9c95-22dfe4206778"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_28369dc0-5113-43eb-a0cd-45ad496b5021/read
correlation: qa-f57893a8-9481-44d1-93a1-e1bed7d95a20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f57893a8-9481-44d1-93a1-e1bed7d95a20
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f57893a8-9481-44d1-93a1-e1bed7d95a20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_28369dc0-5113-43eb-a0cd-45ad496b5021/read","correlationId":"qa-f57893a8-9481-44d1-93a1-e1bed7d95a20"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41c1f131-b80c-47ff-a216-c14a96ad5ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41c1f131-b80c-47ff-a216-c14a96ad5ba8
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41c1f131-b80c-47ff-a216-c14a96ad5ba8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-c97d1cf5-8ae2-44f1-9bd4-29a80bfa55b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c97d1cf5-8ae2-44f1-9bd4-29a80bfa55b4
Content-Type: application/json

--- request body ---
{"handle":"qa-7230eceec8c6","password":"****"}

--- response: 401 in 48 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c97d1cf5-8ae2-44f1-9bd4-29a80bfa55b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c97d1cf5-8ae2-44f1-9bd4-29a80bfa55b4"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-09fe472e-7bbb-4b4f-8acc-9b7b99a19864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09fe472e-7bbb-4b4f-8acc-9b7b99a19864
Content-Type: application/json

--- request body ---
{"handle":"qa-55d8eacdaf6d","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-09fe472e-7bbb-4b4f-8acc-9b7b99a19864
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc83897c-b9a1-4017-aada-aae513914eee"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba652f49-c37a-4795-aecc-83ac276e6f15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba652f49-c37a-4795-aecc-83ac276e6f15
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba652f49-c37a-4795-aecc-83ac276e6f15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-7e8c3777-653f-459c-9d3a-720208b44a87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e8c3777-653f-459c-9d3a-720208b44a87
Content-Type: application/json

--- request body ---
{"handle":"qa-55d8eacdaf6d","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e8c3777-653f-459c-9d3a-720208b44a87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e8c3777-653f-459c-9d3a-720208b44a87"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6cc6cd7-1cb7-4d7a-b93a-1851321b192a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6cc6cd7-1cb7-4d7a-b93a-1851321b192a
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6cc6cd7-1cb7-4d7a-b93a-1851321b192a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-416a205a-2e1a-46e3-9fb8-32a73d43dea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-416a205a-2e1a-46e3-9fb8-32a73d43dea9
Content-Type: application/json

--- request body ---
{"handle":"qa-3a0dd0975772","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-416a205a-2e1a-46e3-9fb8-32a73d43dea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-416a205a-2e1a-46e3-9fb8-32a73d43dea9"}
```
