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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-2c56d1e7-7d41-4e94-b241-ce8a42762cbd` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-099b98c4-e1ca-47d2-828b-bf34936e3741` |
| 3 | `POST /v1/auth/token` | 200 | 54 | `qa-1f8b1159-bd81-4c4d-b2ae-b6917968e496` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-a7caacd4-eacf-41d0-a926-0897115b081a` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 8 | `qa-2e43fff5-5c4a-4b62-b74c-55f434e02f5d` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-389aaf19-22da-43ea-b451-c56a14f13fc2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-78cbd97f-d336-4314-8f04-7c842ce27adf` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-00709e8a-e07a-42cd-9cda-cf02592c9902` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-9125998b-f432-47b0-a490-03e6dcfc1397` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-09213e6a-4630-464f-958b-e4191cacbf6c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c56d1e7-7d41-4e94-b241-ce8a42762cbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c56d1e7-7d41-4e94-b241-ce8a42762cbd
Content-Type: application/json

--- request body ---
{"handle":"qa-b84354a3781e","displayName":"QA b84354a3781e","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c56d1e7-7d41-4e94-b241-ce8a42762cbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Location: /v1/accounts/qa-b84354a3781e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23a9d0b2-f749-46e0-9b5e-99f475eb240e","handle":"qa-b84354a3781e","displayName":"QA b84354a3781e","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.730432231Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-099b98c4-e1ca-47d2-828b-bf34936e3741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-099b98c4-e1ca-47d2-828b-bf34936e3741
Content-Type: application/json

--- request body ---
{"handle":"qa-94211b9b5578","displayName":"QA 94211b9b5578","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-099b98c4-e1ca-47d2-828b-bf34936e3741
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-94211b9b5578
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5811008b-19e2-41a8-a6d9-df4d46b18250","handle":"qa-94211b9b5578","displayName":"QA 94211b9b5578","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.781693487Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1f8b1159-bd81-4c4d-b2ae-b6917968e496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f8b1159-bd81-4c4d-b2ae-b6917968e496
Content-Type: application/json

--- request body ---
{"handle":"qa-b84354a3781e","password":"****"}

--- response: 200 in 54 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f8b1159-bd81-4c4d-b2ae-b6917968e496
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23a9d0b2-f749-46e0-9b5e-99f475eb240e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a7caacd4-eacf-41d0-a926-0897115b081a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7caacd4-eacf-41d0-a926-0897115b081a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94211b9b5578","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7caacd4-eacf-41d0-a926-0897115b081a
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
Location: /v1/conversations/cnv_82227099-d2fa-4c57-84c9-de3e5aed8faf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_82227099-d2fa-4c57-84c9-de3e5aed8faf","subject":"Error contract","status":"open","region":"eu","participants":["qa-b84354a3781e","qa-94211b9b5578"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.900870040Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_82227099-d2fa-4c57-84c9-de3e5aed8faf/messages
correlation: qa-2e43fff5-5c4a-4b62-b74c-55f434e02f5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e43fff5-5c4a-4b62-b74c-55f434e02f5d
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e43fff5-5c4a-4b62-b74c-55f434e02f5d
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_82227099-d2fa-4c57-84c9-de3e5aed8faf/messages","correlationId":"qa-2e43fff5-5c4a-4b62-b74c-55f434e02f5d","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-389aaf19-22da-43ea-b451-c56a14f13fc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-389aaf19-22da-43ea-b451-c56a14f13fc2
Content-Type: application/json

--- request body ---
{"handle":"qa-94211b9b5578","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-389aaf19-22da-43ea-b451-c56a14f13fc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5811008b-19e2-41a8-a6d9-df4d46b18250"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78cbd97f-d336-4314-8f04-7c842ce27adf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78cbd97f-d336-4314-8f04-7c842ce27adf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78cbd97f-d336-4314-8f04-7c842ce27adf
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
correlation: qa-00709e8a-e07a-42cd-9cda-cf02592c9902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00709e8a-e07a-42cd-9cda-cf02592c9902
Content-Type: application/json

--- request body ---
{"handle":"qa-94211b9b5578","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00709e8a-e07a-42cd-9cda-cf02592c9902
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-00709e8a-e07a-42cd-9cda-cf02592c9902"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9125998b-f432-47b0-a490-03e6dcfc1397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9125998b-f432-47b0-a490-03e6dcfc1397
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9125998b-f432-47b0-a490-03e6dcfc1397
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
correlation: qa-09213e6a-4630-464f-958b-e4191cacbf6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09213e6a-4630-464f-958b-e4191cacbf6c
Content-Type: application/json

--- request body ---
{"handle":"qa-b84354a3781e","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09213e6a-4630-464f-958b-e4191cacbf6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09213e6a-4630-464f-958b-e4191cacbf6c"}
```
