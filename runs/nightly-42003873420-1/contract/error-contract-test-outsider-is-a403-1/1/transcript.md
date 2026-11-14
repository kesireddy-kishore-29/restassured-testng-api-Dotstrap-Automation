# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-5292694f-780f-486c-b9bc-8a8c59b29df7` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-238659a9-823b-4718-8d5d-2a6f57240b03` |
| 3 | `POST /v1/accounts` | 201 | 30 | `qa-c40220ee-1214-47c5-b4ce-b88abc808bd1` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-ed33a210-ee1b-4828-8e8b-cc6dfc2794b4` |
| 5 | `POST /v1/conversations` | 201 | 36 | `qa-4468f88f-24c2-457c-b59e-88c6d5ffbe72` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-a6eb8662-5cd8-43a1-bea1-c74890e50cdc` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 6 | `qa-b54b4518-b435-4517-8198-a4ffe3e2f815` |
| 8 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-ec184979-7f10-4f70-9c2f-7aa810ab4f3d` |
| 9 | `POST /v1/auth/token` | 401 | 29 | `qa-16a06de4-7678-4d42-aa15-00258151ef8b` |
| 10 | `POST /v1/auth/token` | 200 | 49 | `qa-22acffb3-29ff-40ac-a9da-c7171f7f9c7a` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-5878723f-92a0-4b10-b7ea-5bf95fbe2479` |
| 12 | `POST /v1/auth/token` | 401 | 31 | `qa-1eb86771-012f-4070-ac9b-079c6f54d112` |
| 13 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-3b4f61e9-0978-4535-b9ad-a6ed90fe30de` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-b5ca2f45-f5a0-42f5-a0e6-dc1b5bd87179` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5292694f-780f-486c-b9bc-8a8c59b29df7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5292694f-780f-486c-b9bc-8a8c59b29df7
Content-Type: application/json

--- request body ---
{"handle":"qa-96829e35df30","displayName":"QA 96829e35df30","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5292694f-780f-486c-b9bc-8a8c59b29df7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-96829e35df30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ded38011-e249-46f4-97bf-58e42078997c","handle":"qa-96829e35df30","displayName":"QA 96829e35df30","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.065130583Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-238659a9-823b-4718-8d5d-2a6f57240b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-238659a9-823b-4718-8d5d-2a6f57240b03
Content-Type: application/json

--- request body ---
{"handle":"qa-c659993b5764","displayName":"QA c659993b5764","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-238659a9-823b-4718-8d5d-2a6f57240b03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-c659993b5764
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1124015e-ee9d-4824-89c1-87019b1ca45e","handle":"qa-c659993b5764","displayName":"QA c659993b5764","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.109835633Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-c40220ee-1214-47c5-b4ce-b88abc808bd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40220ee-1214-47c5-b4ce-b88abc808bd1
Content-Type: application/json

--- request body ---
{"handle":"qa-df11e2d13f27","displayName":"QA df11e2d13f27","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c40220ee-1214-47c5-b4ce-b88abc808bd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-df11e2d13f27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe852202-0ed9-49b7-8527-46eb87ffd838","handle":"qa-df11e2d13f27","displayName":"QA df11e2d13f27","region":"eu","role":"user","createdAt":"2026-11-05T09:37:54.156173428Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ed33a210-ee1b-4828-8e8b-cc6dfc2794b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed33a210-ee1b-4828-8e8b-cc6dfc2794b4
Content-Type: application/json

--- request body ---
{"handle":"qa-96829e35df30","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed33a210-ee1b-4828-8e8b-cc6dfc2794b4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ded38011-e249-46f4-97bf-58e42078997c"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4468f88f-24c2-457c-b59e-88c6d5ffbe72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4468f88f-24c2-457c-b59e-88c6d5ffbe72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c659993b5764","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4468f88f-24c2-457c-b59e-88c6d5ffbe72
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
Location: /v1/conversations/cnv_871bcf1c-c2e1-4f52-b3c4-4d8fab29fa9b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_871bcf1c-c2e1-4f52-b3c4-4d8fab29fa9b","subject":"Error contract","status":"open","region":"eu","participants":["qa-96829e35df30","qa-c659993b5764"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:54.235109876Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a6eb8662-5cd8-43a1-bea1-c74890e50cdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6eb8662-5cd8-43a1-bea1-c74890e50cdc
Content-Type: application/json

--- request body ---
{"handle":"qa-df11e2d13f27","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6eb8662-5cd8-43a1-bea1-c74890e50cdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe852202-0ed9-49b7-8527-46eb87ffd838"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_871bcf1c-c2e1-4f52-b3c4-4d8fab29fa9b/messages
correlation: qa-b54b4518-b435-4517-8198-a4ffe3e2f815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b54b4518-b435-4517-8198-a4ffe3e2f815
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b54b4518-b435-4517-8198-a4ffe3e2f815
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_871bcf1c-c2e1-4f52-b3c4-4d8fab29fa9b/messages","correlationId":"qa-b54b4518-b435-4517-8198-a4ffe3e2f815"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec184979-7f10-4f70-9c2f-7aa810ab4f3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec184979-7f10-4f70-9c2f-7aa810ab4f3d
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec184979-7f10-4f70-9c2f-7aa810ab4f3d
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
correlation: qa-16a06de4-7678-4d42-aa15-00258151ef8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16a06de4-7678-4d42-aa15-00258151ef8b
Content-Type: application/json

--- request body ---
{"handle":"qa-df11e2d13f27","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16a06de4-7678-4d42-aa15-00258151ef8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-16a06de4-7678-4d42-aa15-00258151ef8b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-22acffb3-29ff-40ac-a9da-c7171f7f9c7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22acffb3-29ff-40ac-a9da-c7171f7f9c7a
Content-Type: application/json

--- request body ---
{"handle":"qa-c659993b5764","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-22acffb3-29ff-40ac-a9da-c7171f7f9c7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1124015e-ee9d-4824-89c1-87019b1ca45e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5878723f-92a0-4b10-b7ea-5bf95fbe2479

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5878723f-92a0-4b10-b7ea-5bf95fbe2479
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5878723f-92a0-4b10-b7ea-5bf95fbe2479
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
correlation: qa-1eb86771-012f-4070-ac9b-079c6f54d112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eb86771-012f-4070-ac9b-079c6f54d112
Content-Type: application/json

--- request body ---
{"handle":"qa-c659993b5764","password":"****"}

--- response: 401 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1eb86771-012f-4070-ac9b-079c6f54d112
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1eb86771-012f-4070-ac9b-079c6f54d112"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b4f61e9-0978-4535-b9ad-a6ed90fe30de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b4f61e9-0978-4535-b9ad-a6ed90fe30de
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b4f61e9-0978-4535-b9ad-a6ed90fe30de
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
correlation: qa-b5ca2f45-f5a0-42f5-a0e6-dc1b5bd87179

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ca2f45-f5a0-42f5-a0e6-dc1b5bd87179
Content-Type: application/json

--- request body ---
{"handle":"qa-96829e35df30","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5ca2f45-f5a0-42f5-a0e6-dc1b5bd87179
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5ca2f45-f5a0-42f5-a0e6-dc1b5bd87179"}
```
