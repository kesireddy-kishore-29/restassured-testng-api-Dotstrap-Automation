# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-51f6355f-e808-427d-8296-8b9817cad1e5` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-53c80b14-432a-4463-ae66-3f409ff27137` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-55f88228-15cb-4cb6-9890-b2e8cf67295f` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-dcf4f1b3-061d-4192-a8a0-95d5764c23ef` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 18 | `qa-c5571dd7-8e7d-4b14-b4df-8ffdbddd22ad` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-443c889c-7511-44d0-ad56-391e5fd15a25` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a4d90cf9-842f-4558-a606-fbbcaea65647` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-d462d683-9115-434f-94b1-dc919f32b401` |
| 9 | `DELETE /v1/accounts/me` | 204 | 65 | `qa-9f6d6526-d640-4ca5-8b5a-4111101398b4` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-9cc838c0-7b40-4549-9672-3140ed5ebc11` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-51f6355f-e808-427d-8296-8b9817cad1e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51f6355f-e808-427d-8296-8b9817cad1e5
Content-Type: application/json

--- request body ---
{"handle":"qa-548d3a2dd6be","displayName":"QA 548d3a2dd6be","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-51f6355f-e808-427d-8296-8b9817cad1e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 7
Location: /v1/accounts/qa-548d3a2dd6be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c5fc4fb-2df5-453e-944e-cd44bbb16124","handle":"qa-548d3a2dd6be","displayName":"QA 548d3a2dd6be","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.103352083Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-53c80b14-432a-4463-ae66-3f409ff27137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53c80b14-432a-4463-ae66-3f409ff27137
Content-Type: application/json

--- request body ---
{"handle":"qa-4c54cd03196f","displayName":"QA 4c54cd03196f","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-53c80b14-432a-4463-ae66-3f409ff27137
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Location: /v1/accounts/qa-4c54cd03196f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ea03d7b-a56d-455d-9b29-a8e193f74ee3","handle":"qa-4c54cd03196f","displayName":"QA 4c54cd03196f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.160306479Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-55f88228-15cb-4cb6-9890-b2e8cf67295f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55f88228-15cb-4cb6-9890-b2e8cf67295f
Content-Type: application/json

--- request body ---
{"handle":"qa-548d3a2dd6be","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-55f88228-15cb-4cb6-9890-b2e8cf67295f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c5fc4fb-2df5-453e-944e-cd44bbb16124"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dcf4f1b3-061d-4192-a8a0-95d5764c23ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf4f1b3-061d-4192-a8a0-95d5764c23ef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4c54cd03196f","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcf4f1b3-061d-4192-a8a0-95d5764c23ef
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
Location: /v1/conversations/cnv_cb5c4672-bb4e-4f47-b873-c3def602d125
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cb5c4672-bb4e-4f47-b873-c3def602d125","subject":"Error contract","status":"open","region":"eu","participants":["qa-548d3a2dd6be","qa-4c54cd03196f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.243552573Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_cb5c4672-bb4e-4f47-b873-c3def602d125/messages
correlation: qa-c5571dd7-8e7d-4b14-b4df-8ffdbddd22ad

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: cadee262-7a8c-4e8b-a41f-3e683f8ba937
X-Correlation-Id: qa-c5571dd7-8e7d-4b14-b4df-8ffdbddd22ad
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5571dd7-8e7d-4b14-b4df-8ffdbddd22ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_cb5c4672-bb4e-4f47-b873-c3def602d125/messages","correlationId":"qa-c5571dd7-8e7d-4b14-b4df-8ffdbddd22ad"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-443c889c-7511-44d0-ad56-391e5fd15a25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443c889c-7511-44d0-ad56-391e5fd15a25
Content-Type: application/json

--- request body ---
{"handle":"qa-4c54cd03196f","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-443c889c-7511-44d0-ad56-391e5fd15a25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ea03d7b-a56d-455d-9b29-a8e193f74ee3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4d90cf9-842f-4558-a606-fbbcaea65647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d90cf9-842f-4558-a606-fbbcaea65647
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4d90cf9-842f-4558-a606-fbbcaea65647
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-d462d683-9115-434f-94b1-dc919f32b401

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d462d683-9115-434f-94b1-dc919f32b401
Content-Type: application/json

--- request body ---
{"handle":"qa-4c54cd03196f","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d462d683-9115-434f-94b1-dc919f32b401
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d462d683-9115-434f-94b1-dc919f32b401"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f6d6526-d640-4ca5-8b5a-4111101398b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f6d6526-d640-4ca5-8b5a-4111101398b4
Content-Type: application/json

--- response: 204 in 65 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f6d6526-d640-4ca5-8b5a-4111101398b4
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9cc838c0-7b40-4549-9672-3140ed5ebc11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cc838c0-7b40-4549-9672-3140ed5ebc11
Content-Type: application/json

--- request body ---
{"handle":"qa-548d3a2dd6be","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cc838c0-7b40-4549-9672-3140ed5ebc11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9cc838c0-7b40-4549-9672-3140ed5ebc11"}
```
