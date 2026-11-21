# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-3e9c10cc-80e4-45ed-b58f-29b385521150` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-8e174b78-e48c-49b0-b8d9-cf23caee5b5d` |
| 3 | `POST /v1/accounts` | 201 | 31 | `qa-2577529e-2a9a-4d58-b758-7e8cb847506a` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-a0d45065-eb04-434f-91c2-24c84e7e6b08` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-01d0e65a-b987-457e-88e7-9f534d525ed6` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-c8ed5376-fd68-416d-bcf1-346f29d0e5d9` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 14 | `qa-2a92edba-7452-4652-b70b-dff442e10a2a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-a265728f-4fc6-4276-8286-46bb8c0447e2` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-c23231e6-968c-4739-bef4-77c7edbf5a28` |
| 10 | `POST /v1/auth/token` | 200 | 15 | `qa-2910cd97-37c3-446e-9214-c5a8355eb73f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-55f6667d-9ee7-49cf-8d06-b4ad57768094` |
| 12 | `POST /v1/auth/token` | 401 | 27 | `qa-7c2e2872-a372-46f3-8846-4d286e8bc521` |
| 13 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-d15e18f1-c926-4e30-8fb1-7ed7aae6f186` |
| 14 | `POST /v1/auth/token` | 401 | 16 | `qa-76feedcb-a3ac-4d57-bf94-de6b68e9811b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3e9c10cc-80e4-45ed-b58f-29b385521150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e9c10cc-80e4-45ed-b58f-29b385521150
Content-Type: application/json

--- request body ---
{"handle":"qa-ef0f2d814297","displayName":"QA ef0f2d814297","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e9c10cc-80e4-45ed-b58f-29b385521150
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Location: /v1/accounts/qa-ef0f2d814297
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a33e8482-c3ba-4f09-89c2-928b0968f277","handle":"qa-ef0f2d814297","displayName":"QA ef0f2d814297","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.693343634Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8e174b78-e48c-49b0-b8d9-cf23caee5b5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e174b78-e48c-49b0-b8d9-cf23caee5b5d
Content-Type: application/json

--- request body ---
{"handle":"qa-2b73c6bfc8f2","displayName":"QA 2b73c6bfc8f2","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e174b78-e48c-49b0-b8d9-cf23caee5b5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 10
Location: /v1/accounts/qa-2b73c6bfc8f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72550eb6-99cb-49d6-b154-b60ec0e20476","handle":"qa-2b73c6bfc8f2","displayName":"QA 2b73c6bfc8f2","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.744682327Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2577529e-2a9a-4d58-b758-7e8cb847506a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2577529e-2a9a-4d58-b758-7e8cb847506a
Content-Type: application/json

--- request body ---
{"handle":"qa-1d0ace0ef8ea","displayName":"QA 1d0ace0ef8ea","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2577529e-2a9a-4d58-b758-7e8cb847506a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-1d0ace0ef8ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f7c1fba-e6e6-446f-86f8-48101c0982f4","handle":"qa-1d0ace0ef8ea","displayName":"QA 1d0ace0ef8ea","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.798999030Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a0d45065-eb04-434f-91c2-24c84e7e6b08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d45065-eb04-434f-91c2-24c84e7e6b08
Content-Type: application/json

--- request body ---
{"handle":"qa-ef0f2d814297","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0d45065-eb04-434f-91c2-24c84e7e6b08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a33e8482-c3ba-4f09-89c2-928b0968f277"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-01d0e65a-b987-457e-88e7-9f534d525ed6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01d0e65a-b987-457e-88e7-9f534d525ed6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2b73c6bfc8f2","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-01d0e65a-b987-457e-88e7-9f534d525ed6
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
Location: /v1/conversations/cnv_9e13cf3b-e5f5-4185-a28e-b9ccebc19793
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9e13cf3b-e5f5-4185-a28e-b9ccebc19793","subject":"Error contract","status":"open","region":"eu","participants":["qa-ef0f2d814297","qa-2b73c6bfc8f2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.854580200Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c8ed5376-fd68-416d-bcf1-346f29d0e5d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8ed5376-fd68-416d-bcf1-346f29d0e5d9
Content-Type: application/json

--- request body ---
{"handle":"qa-1d0ace0ef8ea","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8ed5376-fd68-416d-bcf1-346f29d0e5d9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f7c1fba-e6e6-446f-86f8-48101c0982f4"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_9e13cf3b-e5f5-4185-a28e-b9ccebc19793/messages
correlation: qa-2a92edba-7452-4652-b70b-dff442e10a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a92edba-7452-4652-b70b-dff442e10a2a
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a92edba-7452-4652-b70b-dff442e10a2a
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9e13cf3b-e5f5-4185-a28e-b9ccebc19793/messages","correlationId":"qa-2a92edba-7452-4652-b70b-dff442e10a2a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a265728f-4fc6-4276-8286-46bb8c0447e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a265728f-4fc6-4276-8286-46bb8c0447e2
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a265728f-4fc6-4276-8286-46bb8c0447e2
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
correlation: qa-c23231e6-968c-4739-bef4-77c7edbf5a28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c23231e6-968c-4739-bef4-77c7edbf5a28
Content-Type: application/json

--- request body ---
{"handle":"qa-1d0ace0ef8ea","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c23231e6-968c-4739-bef4-77c7edbf5a28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c23231e6-968c-4739-bef4-77c7edbf5a28"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2910cd97-37c3-446e-9214-c5a8355eb73f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2910cd97-37c3-446e-9214-c5a8355eb73f
Content-Type: application/json

--- request body ---
{"handle":"qa-2b73c6bfc8f2","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-2910cd97-37c3-446e-9214-c5a8355eb73f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72550eb6-99cb-49d6-b154-b60ec0e20476"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55f6667d-9ee7-49cf-8d06-b4ad57768094

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55f6667d-9ee7-49cf-8d06-b4ad57768094
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55f6667d-9ee7-49cf-8d06-b4ad57768094
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
correlation: qa-7c2e2872-a372-46f3-8846-4d286e8bc521

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c2e2872-a372-46f3-8846-4d286e8bc521
Content-Type: application/json

--- request body ---
{"handle":"qa-2b73c6bfc8f2","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c2e2872-a372-46f3-8846-4d286e8bc521
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c2e2872-a372-46f3-8846-4d286e8bc521"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d15e18f1-c926-4e30-8fb1-7ed7aae6f186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d15e18f1-c926-4e30-8fb1-7ed7aae6f186
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d15e18f1-c926-4e30-8fb1-7ed7aae6f186
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-76feedcb-a3ac-4d57-bf94-de6b68e9811b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76feedcb-a3ac-4d57-bf94-de6b68e9811b
Content-Type: application/json

--- request body ---
{"handle":"qa-ef0f2d814297","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76feedcb-a3ac-4d57-bf94-de6b68e9811b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76feedcb-a3ac-4d57-bf94-de6b68e9811b"}
```
