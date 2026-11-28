# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 274 | `qa-a480113d-ec93-48dd-a5c6-f33f314f270c` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-d0bcfda0-c217-4de5-a01e-324bd29b0677` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-c9e2f2af-5663-4439-8d14-6c3349f7e8c8` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-b9592b97-b6b6-4b5c-9018-61091133f41a` |
| 5 | `POST /v1/auth/token` | 200 | 19 | `qa-568b8301-99e9-4efe-ae75-a01aaabb137f` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-bdcb238e-413c-4215-a9e9-eaf8aebcfaeb` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-dc1d356b-ea78-4924-b693-d55d891c80b6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-49a70b98-da1a-4cca-94e8-d3cbda10c431` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-d808d9cf-bccb-48cf-a7e3-328f55b86bad` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-110dcbac-05fe-4ef0-9047-64dc1c32cf02` |
| 11 | `POST /v1/auth/token` | 401 | 3 | `qa-2660352d-b90e-49b0-9a41-a2fe294e1bd0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a480113d-ec93-48dd-a5c6-f33f314f270c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a480113d-ec93-48dd-a5c6-f33f314f270c
Content-Type: application/json

--- request body ---
{"handle":"qa-162c0d3034fe","displayName":"QA 162c0d3034fe","password":"****","region":"eu"}

--- response: 201 in 274 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a480113d-ec93-48dd-a5c6-f33f314f270c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-162c0d3034fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c888fbc-f9fe-4bed-af97-bd3246ed8a62","handle":"qa-162c0d3034fe","displayName":"QA 162c0d3034fe","region":"eu","role":"user","createdAt":"2026-11-22T09:54:46.084185570Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d0bcfda0-c217-4de5-a01e-324bd29b0677

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0bcfda0-c217-4de5-a01e-324bd29b0677
Content-Type: application/json

--- request body ---
{"handle":"qa-c7a085829b84","displayName":"QA c7a085829b84","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0bcfda0-c217-4de5-a01e-324bd29b0677
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-c7a085829b84
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e5b7da7-308b-4754-bce8-78685da60730","handle":"qa-c7a085829b84","displayName":"QA c7a085829b84","region":"eu","role":"user","createdAt":"2026-11-22T09:54:46.390445701Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c9e2f2af-5663-4439-8d14-6c3349f7e8c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9e2f2af-5663-4439-8d14-6c3349f7e8c8
Content-Type: application/json

--- request body ---
{"handle":"qa-162c0d3034fe","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9e2f2af-5663-4439-8d14-6c3349f7e8c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c888fbc-f9fe-4bed-af97-bd3246ed8a62"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b9592b97-b6b6-4b5c-9018-61091133f41a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9592b97-b6b6-4b5c-9018-61091133f41a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c7a085829b84","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 48 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9592b97-b6b6-4b5c-9018-61091133f41a
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
Location: /v1/conversations/cnv_9392af65-3bc1-4c4f-b8cb-a71bafc23c27
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_9392af65-3bc1-4c4f-b8cb-a71bafc23c27","subject":"Lunch?","status":"open","region":"eu","participants":["qa-162c0d3034fe","qa-c7a085829b84"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:46.529735529Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-568b8301-99e9-4efe-ae75-a01aaabb137f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-568b8301-99e9-4efe-ae75-a01aaabb137f
Content-Type: application/json

--- request body ---
{"handle":"qa-c7a085829b84","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-568b8301-99e9-4efe-ae75-a01aaabb137f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e5b7da7-308b-4754-bce8-78685da60730"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_9392af65-3bc1-4c4f-b8cb-a71bafc23c27/messages
correlation: qa-bdcb238e-413c-4215-a9e9-eaf8aebcfaeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdcb238e-413c-4215-a9e9-eaf8aebcfaeb
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdcb238e-413c-4215-a9e9-eaf8aebcfaeb
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
Content-Length: 203

{"id":"msg_eed5e5df-3797-4c5e-8075-2ebe879a4905","conversationId":"cnv_9392af65-3bc1-4c4f-b8cb-a71bafc23c27","sender":"qa-c7a085829b84","body":"Friday works","createdAt":"2026-11-22T09:54:46.636511599Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9392af65-3bc1-4c4f-b8cb-a71bafc23c27/messages
correlation: qa-dc1d356b-ea78-4924-b693-d55d891c80b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc1d356b-ea78-4924-b693-d55d891c80b6
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc1d356b-ea78-4924-b693-d55d891c80b6
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
Content-Length: 432

{"items":[{"id":"msg_ac024b32-3e6f-4cbe-ab57-59ae9d82fbf5","conversationId":"cnv_9392af65-3bc1-4c4f-b8cb-a71bafc23c27","sender":"qa-162c0d3034fe","body":"Free on Friday?","createdAt":"2026-11-22T09:54:46.529914560Z"},{"id":"msg_eed5e5df-3797-4c5e-8075-2ebe879a4905","conversationId":"cnv_9392af65-3bc1-4c4f-b8cb-a71bafc23c27","sender":"qa-c7a085829b84","body":"Friday works","createdAt":"2026-11-22T09:54:46.636511599Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-49a70b98-da1a-4cca-94e8-d3cbda10c431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49a70b98-da1a-4cca-94e8-d3cbda10c431
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-49a70b98-da1a-4cca-94e8-d3cbda10c431
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
correlation: qa-d808d9cf-bccb-48cf-a7e3-328f55b86bad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d808d9cf-bccb-48cf-a7e3-328f55b86bad
Content-Type: application/json

--- request body ---
{"handle":"qa-c7a085829b84","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d808d9cf-bccb-48cf-a7e3-328f55b86bad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d808d9cf-bccb-48cf-a7e3-328f55b86bad"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-110dcbac-05fe-4ef0-9047-64dc1c32cf02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-110dcbac-05fe-4ef0-9047-64dc1c32cf02
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-110dcbac-05fe-4ef0-9047-64dc1c32cf02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-2660352d-b90e-49b0-9a41-a2fe294e1bd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2660352d-b90e-49b0-9a41-a2fe294e1bd0
Content-Type: application/json

--- request body ---
{"handle":"qa-162c0d3034fe","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2660352d-b90e-49b0-9a41-a2fe294e1bd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2660352d-b90e-49b0-9a41-a2fe294e1bd0"}
```
