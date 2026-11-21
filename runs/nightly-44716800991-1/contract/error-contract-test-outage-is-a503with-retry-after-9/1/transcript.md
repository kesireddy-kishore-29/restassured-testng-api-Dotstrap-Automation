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
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-7aea5add-a91f-4bfa-8f85-e6678d0755aa` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-87e29b20-494b-499e-941b-404ce33ebc4b` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-b090dbfb-5c24-4bd0-bfcb-f11fdcb8c27f` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-0fae5780-f381-48f5-a3f6-fe752568a0b7` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 18 | `qa-e0f45eb2-743f-4faf-af30-a94609bdf3b6` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-cafcd38c-36b1-46eb-bd5e-d6f08a5f4580` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-83b2a344-27d6-4632-93c7-03955a9f7713` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-a5081ae9-5649-452f-9f2c-8fc079b8ec1a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-33fd2aea-7bfa-4ed4-9e4e-4bb4b38c7434` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-992054e1-19d8-4d6e-98ad-8f05c56be096` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7aea5add-a91f-4bfa-8f85-e6678d0755aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aea5add-a91f-4bfa-8f85-e6678d0755aa
Content-Type: application/json

--- request body ---
{"handle":"qa-f0c5f75767d1","displayName":"QA f0c5f75767d1","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7aea5add-a91f-4bfa-8f85-e6678d0755aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Location: /v1/accounts/qa-f0c5f75767d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e97e84e6-c503-42df-a7be-797e54871956","handle":"qa-f0c5f75767d1","displayName":"QA f0c5f75767d1","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.728430354Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-87e29b20-494b-499e-941b-404ce33ebc4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87e29b20-494b-499e-941b-404ce33ebc4b
Content-Type: application/json

--- request body ---
{"handle":"qa-aa1ad43b8d54","displayName":"QA aa1ad43b8d54","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-87e29b20-494b-499e-941b-404ce33ebc4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Location: /v1/accounts/qa-aa1ad43b8d54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce08ee1e-64d3-4611-be41-da0429b07394","handle":"qa-aa1ad43b8d54","displayName":"QA aa1ad43b8d54","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.804172740Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b090dbfb-5c24-4bd0-bfcb-f11fdcb8c27f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b090dbfb-5c24-4bd0-bfcb-f11fdcb8c27f
Content-Type: application/json

--- request body ---
{"handle":"qa-f0c5f75767d1","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b090dbfb-5c24-4bd0-bfcb-f11fdcb8c27f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e97e84e6-c503-42df-a7be-797e54871956"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0fae5780-f381-48f5-a3f6-fe752568a0b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fae5780-f381-48f5-a3f6-fe752568a0b7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aa1ad43b8d54","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fae5780-f381-48f5-a3f6-fe752568a0b7
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
Location: /v1/conversations/cnv_d862ae0e-2067-42a6-be78-eb69be87858f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d862ae0e-2067-42a6-be78-eb69be87858f","subject":"Error contract","status":"open","region":"eu","participants":["qa-f0c5f75767d1","qa-aa1ad43b8d54"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.887336597Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_d862ae0e-2067-42a6-be78-eb69be87858f/messages
correlation: qa-e0f45eb2-743f-4faf-af30-a94609bdf3b6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f6257f89-9c51-45c6-96c9-f5e2a5d90b9a
X-Correlation-Id: qa-e0f45eb2-743f-4faf-af30-a94609bdf3b6
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0f45eb2-743f-4faf-af30-a94609bdf3b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_d862ae0e-2067-42a6-be78-eb69be87858f/messages","correlationId":"qa-e0f45eb2-743f-4faf-af30-a94609bdf3b6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cafcd38c-36b1-46eb-bd5e-d6f08a5f4580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cafcd38c-36b1-46eb-bd5e-d6f08a5f4580
Content-Type: application/json

--- request body ---
{"handle":"qa-aa1ad43b8d54","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cafcd38c-36b1-46eb-bd5e-d6f08a5f4580
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce08ee1e-64d3-4611-be41-da0429b07394"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83b2a344-27d6-4632-93c7-03955a9f7713

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83b2a344-27d6-4632-93c7-03955a9f7713
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83b2a344-27d6-4632-93c7-03955a9f7713
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
correlation: qa-a5081ae9-5649-452f-9f2c-8fc079b8ec1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5081ae9-5649-452f-9f2c-8fc079b8ec1a
Content-Type: application/json

--- request body ---
{"handle":"qa-aa1ad43b8d54","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5081ae9-5649-452f-9f2c-8fc079b8ec1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5081ae9-5649-452f-9f2c-8fc079b8ec1a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33fd2aea-7bfa-4ed4-9e4e-4bb4b38c7434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33fd2aea-7bfa-4ed4-9e4e-4bb4b38c7434
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33fd2aea-7bfa-4ed4-9e4e-4bb4b38c7434
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
correlation: qa-992054e1-19d8-4d6e-98ad-8f05c56be096

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-992054e1-19d8-4d6e-98ad-8f05c56be096
Content-Type: application/json

--- request body ---
{"handle":"qa-f0c5f75767d1","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-992054e1-19d8-4d6e-98ad-8f05c56be096
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-992054e1-19d8-4d6e-98ad-8f05c56be096"}
```
