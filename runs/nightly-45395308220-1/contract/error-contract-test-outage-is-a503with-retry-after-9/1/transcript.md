# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-5616f54d-0fd0-4bab-869d-7a4f2167425c` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-225be783-f795-434b-9a54-8bd64a600f43` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-17cd8444-15ff-4a98-9350-42fe51afdd2d` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-37995e34-afd4-4e88-98cc-230216e16639` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 17 | `qa-14242082-f140-47cc-bee3-4ee7a5ae8710` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-0a3d5483-16ea-4330-90ec-0fe26d14067c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-7e744bd5-4203-4b79-a141-cdb6ecdd8966` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-db3aa1c4-1217-4991-8535-462ec2473f93` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2dea31d1-564e-415f-b8b8-01259657e12f` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-c4fc83cf-36d3-4563-95e7-6e54e2b62252` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5616f54d-0fd0-4bab-869d-7a4f2167425c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5616f54d-0fd0-4bab-869d-7a4f2167425c
Content-Type: application/json

--- request body ---
{"handle":"qa-c9256fe0d14c","displayName":"QA c9256fe0d14c","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5616f54d-0fd0-4bab-869d-7a4f2167425c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-c9256fe0d14c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f518d7fe-51f9-47c1-b58d-d7851da9d2fb","handle":"qa-c9256fe0d14c","displayName":"QA c9256fe0d14c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.010577913Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-225be783-f795-434b-9a54-8bd64a600f43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-225be783-f795-434b-9a54-8bd64a600f43
Content-Type: application/json

--- request body ---
{"handle":"qa-8d727a295abd","displayName":"QA 8d727a295abd","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-225be783-f795-434b-9a54-8bd64a600f43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-8d727a295abd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a853559-bcc2-42ec-aa05-a7071c6b80e9","handle":"qa-8d727a295abd","displayName":"QA 8d727a295abd","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.094622951Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-17cd8444-15ff-4a98-9350-42fe51afdd2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17cd8444-15ff-4a98-9350-42fe51afdd2d
Content-Type: application/json

--- request body ---
{"handle":"qa-c9256fe0d14c","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-17cd8444-15ff-4a98-9350-42fe51afdd2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f518d7fe-51f9-47c1-b58d-d7851da9d2fb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-37995e34-afd4-4e88-98cc-230216e16639

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37995e34-afd4-4e88-98cc-230216e16639
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8d727a295abd","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-37995e34-afd4-4e88-98cc-230216e16639
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
Location: /v1/conversations/cnv_5cc6edaa-bf22-47b2-a546-ae45de92f3d9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5cc6edaa-bf22-47b2-a546-ae45de92f3d9","subject":"Error contract","status":"open","region":"eu","participants":["qa-c9256fe0d14c","qa-8d727a295abd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.159786253Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_5cc6edaa-bf22-47b2-a546-ae45de92f3d9/messages
correlation: qa-14242082-f140-47cc-bee3-4ee7a5ae8710

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9f4a4872-7780-4974-86f9-91e477fde8a7
X-Correlation-Id: qa-14242082-f140-47cc-bee3-4ee7a5ae8710
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14242082-f140-47cc-bee3-4ee7a5ae8710
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_5cc6edaa-bf22-47b2-a546-ae45de92f3d9/messages","correlationId":"qa-14242082-f140-47cc-bee3-4ee7a5ae8710"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0a3d5483-16ea-4330-90ec-0fe26d14067c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a3d5483-16ea-4330-90ec-0fe26d14067c
Content-Type: application/json

--- request body ---
{"handle":"qa-8d727a295abd","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a3d5483-16ea-4330-90ec-0fe26d14067c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a853559-bcc2-42ec-aa05-a7071c6b80e9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e744bd5-4203-4b79-a141-cdb6ecdd8966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e744bd5-4203-4b79-a141-cdb6ecdd8966
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e744bd5-4203-4b79-a141-cdb6ecdd8966
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
correlation: qa-db3aa1c4-1217-4991-8535-462ec2473f93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db3aa1c4-1217-4991-8535-462ec2473f93
Content-Type: application/json

--- request body ---
{"handle":"qa-8d727a295abd","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db3aa1c4-1217-4991-8535-462ec2473f93
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db3aa1c4-1217-4991-8535-462ec2473f93"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2dea31d1-564e-415f-b8b8-01259657e12f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dea31d1-564e-415f-b8b8-01259657e12f
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2dea31d1-564e-415f-b8b8-01259657e12f
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
correlation: qa-c4fc83cf-36d3-4563-95e7-6e54e2b62252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4fc83cf-36d3-4563-95e7-6e54e2b62252
Content-Type: application/json

--- request body ---
{"handle":"qa-c9256fe0d14c","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4fc83cf-36d3-4563-95e7-6e54e2b62252
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4fc83cf-36d3-4563-95e7-6e54e2b62252"}
```
