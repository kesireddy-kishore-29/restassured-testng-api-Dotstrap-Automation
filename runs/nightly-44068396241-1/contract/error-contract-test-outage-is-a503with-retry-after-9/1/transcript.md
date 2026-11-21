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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-9bc6f1cc-935b-48db-9779-32f51f2849e7` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-e3dccac9-39de-4e67-94b5-958dcb56035c` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-bf096243-842d-4557-9f1d-4a1d3405bf1f` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-aeef8fd0-5a12-4961-95d4-36faeef6bb69` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 22 | `qa-591aa46d-ce5c-40d3-8f49-b7c9ce3a2df0` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-07bf4018-598f-42da-988d-f0a8c1c5cfc8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d0da330d-c365-450d-82be-18b759083347` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-d427f2ac-0d69-4ddc-99fd-8b4bd5d6e1c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c5837eca-d887-4ed3-8c5f-6a0a5f3ca44e` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-a6b10033-eef9-477c-b820-ce821da8592d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9bc6f1cc-935b-48db-9779-32f51f2849e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bc6f1cc-935b-48db-9779-32f51f2849e7
Content-Type: application/json

--- request body ---
{"handle":"qa-c74fcea00ba9","displayName":"QA c74fcea00ba9","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bc6f1cc-935b-48db-9779-32f51f2849e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-c74fcea00ba9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fd192e99-1bb9-4725-b7ab-543673d223e5","handle":"qa-c74fcea00ba9","displayName":"QA c74fcea00ba9","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.367000784Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e3dccac9-39de-4e67-94b5-958dcb56035c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3dccac9-39de-4e67-94b5-958dcb56035c
Content-Type: application/json

--- request body ---
{"handle":"qa-3479680d55cf","displayName":"QA 3479680d55cf","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3dccac9-39de-4e67-94b5-958dcb56035c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Location: /v1/accounts/qa-3479680d55cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e5bb102-bdea-465a-83fa-b2b4cf6d7446","handle":"qa-3479680d55cf","displayName":"QA 3479680d55cf","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.376169257Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bf096243-842d-4557-9f1d-4a1d3405bf1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf096243-842d-4557-9f1d-4a1d3405bf1f
Content-Type: application/json

--- request body ---
{"handle":"qa-c74fcea00ba9","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf096243-842d-4557-9f1d-4a1d3405bf1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fd192e99-1bb9-4725-b7ab-543673d223e5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aeef8fd0-5a12-4961-95d4-36faeef6bb69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeef8fd0-5a12-4961-95d4-36faeef6bb69
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3479680d55cf","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeef8fd0-5a12-4961-95d4-36faeef6bb69
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
Location: /v1/conversations/cnv_912ece65-28f4-41a9-837a-1b30a3da330c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_912ece65-28f4-41a9-837a-1b30a3da330c","subject":"Error contract","status":"open","region":"eu","participants":["qa-c74fcea00ba9","qa-3479680d55cf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.462234221Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_912ece65-28f4-41a9-837a-1b30a3da330c/messages
correlation: qa-591aa46d-ce5c-40d3-8f49-b7c9ce3a2df0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 990bfd89-c804-4e7e-bd53-3459540346d6
X-Correlation-Id: qa-591aa46d-ce5c-40d3-8f49-b7c9ce3a2df0
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-591aa46d-ce5c-40d3-8f49-b7c9ce3a2df0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_912ece65-28f4-41a9-837a-1b30a3da330c/messages","correlationId":"qa-591aa46d-ce5c-40d3-8f49-b7c9ce3a2df0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-07bf4018-598f-42da-988d-f0a8c1c5cfc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07bf4018-598f-42da-988d-f0a8c1c5cfc8
Content-Type: application/json

--- request body ---
{"handle":"qa-3479680d55cf","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-07bf4018-598f-42da-988d-f0a8c1c5cfc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e5bb102-bdea-465a-83fa-b2b4cf6d7446"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0da330d-c365-450d-82be-18b759083347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0da330d-c365-450d-82be-18b759083347
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0da330d-c365-450d-82be-18b759083347
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
correlation: qa-d427f2ac-0d69-4ddc-99fd-8b4bd5d6e1c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d427f2ac-0d69-4ddc-99fd-8b4bd5d6e1c5
Content-Type: application/json

--- request body ---
{"handle":"qa-3479680d55cf","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d427f2ac-0d69-4ddc-99fd-8b4bd5d6e1c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d427f2ac-0d69-4ddc-99fd-8b4bd5d6e1c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5837eca-d887-4ed3-8c5f-6a0a5f3ca44e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5837eca-d887-4ed3-8c5f-6a0a5f3ca44e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5837eca-d887-4ed3-8c5f-6a0a5f3ca44e
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
correlation: qa-a6b10033-eef9-477c-b820-ce821da8592d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6b10033-eef9-477c-b820-ce821da8592d
Content-Type: application/json

--- request body ---
{"handle":"qa-c74fcea00ba9","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6b10033-eef9-477c-b820-ce821da8592d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6b10033-eef9-477c-b820-ce821da8592d"}
```
