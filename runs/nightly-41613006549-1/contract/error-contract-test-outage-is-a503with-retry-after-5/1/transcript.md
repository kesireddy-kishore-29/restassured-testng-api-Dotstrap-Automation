# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-c7d6d000-94b4-4684-bf00-c0f7714d65b5` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-ebcd3404-f992-4eb0-a6d3-1ffd8b71d167` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-e46a855b-f273-447f-bffc-7194dee2d242` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-c23a47b2-4fd8-41c0-9c41-de25d028cb57` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 24 | `qa-3665a5e6-671d-44ce-9c25-dadd8b592a95` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-f90b9cb3-81d6-4db5-aecf-fec1c4b031f9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-65f339fe-c9a7-49b7-9e07-ab500be63850` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-aa8173c2-e112-4615-9678-378aef0c49d1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-cd9c5f39-8056-4522-9538-1aeec60c0f2d` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-a6c2bfca-c0da-4fd0-8c81-ad3f99b82e46` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c7d6d000-94b4-4684-bf00-c0f7714d65b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7d6d000-94b4-4684-bf00-c0f7714d65b5
Content-Type: application/json

--- request body ---
{"handle":"qa-3f91922e4f28","displayName":"QA 3f91922e4f28","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7d6d000-94b4-4684-bf00-c0f7714d65b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Location: /v1/accounts/qa-3f91922e4f28
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b36f4210-1448-4475-89ba-e681c5970437","handle":"qa-3f91922e4f28","displayName":"QA 3f91922e4f28","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.365541018Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ebcd3404-f992-4eb0-a6d3-1ffd8b71d167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebcd3404-f992-4eb0-a6d3-1ffd8b71d167
Content-Type: application/json

--- request body ---
{"handle":"qa-14469dd8cf26","displayName":"QA 14469dd8cf26","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebcd3404-f992-4eb0-a6d3-1ffd8b71d167
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Location: /v1/accounts/qa-14469dd8cf26
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9084eeb4-8b8d-492e-b55f-94a6a9557656","handle":"qa-14469dd8cf26","displayName":"QA 14469dd8cf26","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.408752736Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e46a855b-f273-447f-bffc-7194dee2d242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e46a855b-f273-447f-bffc-7194dee2d242
Content-Type: application/json

--- request body ---
{"handle":"qa-3f91922e4f28","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e46a855b-f273-447f-bffc-7194dee2d242
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b36f4210-1448-4475-89ba-e681c5970437"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c23a47b2-4fd8-41c0-9c41-de25d028cb57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c23a47b2-4fd8-41c0-9c41-de25d028cb57
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-14469dd8cf26","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c23a47b2-4fd8-41c0-9c41-de25d028cb57
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
Location: /v1/conversations/cnv_5eeb1422-3915-4b6d-a3b1-aa4bb62a8a29
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5eeb1422-3915-4b6d-a3b1-aa4bb62a8a29","subject":"Error contract","status":"open","region":"eu","participants":["qa-3f91922e4f28","qa-14469dd8cf26"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.453271012Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-3f91922e4f28
correlation: qa-3665a5e6-671d-44ce-9c25-dadd8b592a95

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 08880ac4-5205-457d-ae7d-ff564bc2f7f7
X-Correlation-Id: qa-3665a5e6-671d-44ce-9c25-dadd8b592a95
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3665a5e6-671d-44ce-9c25-dadd8b592a95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-3f91922e4f28","correlationId":"qa-3665a5e6-671d-44ce-9c25-dadd8b592a95"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f90b9cb3-81d6-4db5-aecf-fec1c4b031f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f90b9cb3-81d6-4db5-aecf-fec1c4b031f9
Content-Type: application/json

--- request body ---
{"handle":"qa-14469dd8cf26","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f90b9cb3-81d6-4db5-aecf-fec1c4b031f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9084eeb4-8b8d-492e-b55f-94a6a9557656"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65f339fe-c9a7-49b7-9e07-ab500be63850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f339fe-c9a7-49b7-9e07-ab500be63850
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65f339fe-c9a7-49b7-9e07-ab500be63850
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
correlation: qa-aa8173c2-e112-4615-9678-378aef0c49d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa8173c2-e112-4615-9678-378aef0c49d1
Content-Type: application/json

--- request body ---
{"handle":"qa-14469dd8cf26","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa8173c2-e112-4615-9678-378aef0c49d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa8173c2-e112-4615-9678-378aef0c49d1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd9c5f39-8056-4522-9538-1aeec60c0f2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd9c5f39-8056-4522-9538-1aeec60c0f2d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd9c5f39-8056-4522-9538-1aeec60c0f2d
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
correlation: qa-a6c2bfca-c0da-4fd0-8c81-ad3f99b82e46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c2bfca-c0da-4fd0-8c81-ad3f99b82e46
Content-Type: application/json

--- request body ---
{"handle":"qa-3f91922e4f28","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6c2bfca-c0da-4fd0-8c81-ad3f99b82e46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6c2bfca-c0da-4fd0-8c81-ad3f99b82e46"}
```
