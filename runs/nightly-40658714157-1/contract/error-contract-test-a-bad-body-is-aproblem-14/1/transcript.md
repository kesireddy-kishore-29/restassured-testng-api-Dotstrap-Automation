# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-468241c8-82d5-47c8-b5cd-afd5d5920619` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-a1d6ed3b-f58c-4cce-96b5-5f86e5a80e5a` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-fd5c71dd-2a98-4441-b6d1-a0c39dc86392` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-07baab1f-a433-4cad-9c03-65fb6b159360` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 25 | `qa-98a242e8-59b3-4b90-9348-7ff5320569b5` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-90e71fcd-f423-48b9-93c7-68aaafdc1ac8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-64805bb8-b281-468a-9f6a-842aef272aeb` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-6d7e61d9-c8b7-4987-92c0-cb5991a15eed` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-92a1c747-b950-47cf-9a70-35969e7e1b9b` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-8ae4d831-d845-475e-92fb-63ac62ad6664` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-468241c8-82d5-47c8-b5cd-afd5d5920619

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-468241c8-82d5-47c8-b5cd-afd5d5920619
Content-Type: application/json

--- request body ---
{"handle":"qa-af5d2693bc11","displayName":"QA af5d2693bc11","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-468241c8-82d5-47c8-b5cd-afd5d5920619
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Location: /v1/accounts/qa-af5d2693bc11
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15ed5689-cd14-405c-b3c1-8e4d06bd02c9","handle":"qa-af5d2693bc11","displayName":"QA af5d2693bc11","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.092129673Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1d6ed3b-f58c-4cce-96b5-5f86e5a80e5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1d6ed3b-f58c-4cce-96b5-5f86e5a80e5a
Content-Type: application/json

--- request body ---
{"handle":"qa-cdda1382cbac","displayName":"QA cdda1382cbac","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1d6ed3b-f58c-4cce-96b5-5f86e5a80e5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Location: /v1/accounts/qa-cdda1382cbac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3313e9fe-06e8-4374-8f12-afa37ebc9c3f","handle":"qa-cdda1382cbac","displayName":"QA cdda1382cbac","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.118054137Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd5c71dd-2a98-4441-b6d1-a0c39dc86392

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd5c71dd-2a98-4441-b6d1-a0c39dc86392
Content-Type: application/json

--- request body ---
{"handle":"qa-af5d2693bc11","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd5c71dd-2a98-4441-b6d1-a0c39dc86392
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15ed5689-cd14-405c-b3c1-8e4d06bd02c9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-07baab1f-a433-4cad-9c03-65fb6b159360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07baab1f-a433-4cad-9c03-65fb6b159360
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cdda1382cbac","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-07baab1f-a433-4cad-9c03-65fb6b159360
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
Location: /v1/conversations/cnv_f3ba6738-a469-4178-9269-fa2468514623
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3ba6738-a469-4178-9269-fa2468514623","subject":"Error contract","status":"open","region":"eu","participants":["qa-af5d2693bc11","qa-cdda1382cbac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.163844632Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f3ba6738-a469-4178-9269-fa2468514623/messages
correlation: qa-98a242e8-59b3-4b90-9348-7ff5320569b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98a242e8-59b3-4b90-9348-7ff5320569b5
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98a242e8-59b3-4b90-9348-7ff5320569b5
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_f3ba6738-a469-4178-9269-fa2468514623/messages","correlationId":"qa-98a242e8-59b3-4b90-9348-7ff5320569b5","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-90e71fcd-f423-48b9-93c7-68aaafdc1ac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90e71fcd-f423-48b9-93c7-68aaafdc1ac8
Content-Type: application/json

--- request body ---
{"handle":"qa-cdda1382cbac","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-90e71fcd-f423-48b9-93c7-68aaafdc1ac8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3313e9fe-06e8-4374-8f12-afa37ebc9c3f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64805bb8-b281-468a-9f6a-842aef272aeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64805bb8-b281-468a-9f6a-842aef272aeb
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64805bb8-b281-468a-9f6a-842aef272aeb
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
correlation: qa-6d7e61d9-c8b7-4987-92c0-cb5991a15eed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d7e61d9-c8b7-4987-92c0-cb5991a15eed
Content-Type: application/json

--- request body ---
{"handle":"qa-cdda1382cbac","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d7e61d9-c8b7-4987-92c0-cb5991a15eed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d7e61d9-c8b7-4987-92c0-cb5991a15eed"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-92a1c747-b950-47cf-9a70-35969e7e1b9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a1c747-b950-47cf-9a70-35969e7e1b9b
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-92a1c747-b950-47cf-9a70-35969e7e1b9b
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8ae4d831-d845-475e-92fb-63ac62ad6664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae4d831-d845-475e-92fb-63ac62ad6664
Content-Type: application/json

--- request body ---
{"handle":"qa-af5d2693bc11","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ae4d831-d845-475e-92fb-63ac62ad6664
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ae4d831-d845-475e-92fb-63ac62ad6664"}
```
