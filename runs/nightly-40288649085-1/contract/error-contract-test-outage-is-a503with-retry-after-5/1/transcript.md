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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-68a15a5f-9599-41a8-9c40-73c91f4f28ef` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-a793c35e-287a-4af2-95dc-fa3dc32f827c` |
| 3 | `POST /v1/auth/token` | 200 | 74 | `qa-eb481263-1d6d-4483-9805-ffc5ad4d56db` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-8ff49622-de28-469e-bacc-c50e0ada1bed` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 24 | `qa-e5af47b2-c078-4349-9d97-ea3ffc8aeded` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-4fb1fb28-451b-4ce5-8195-0562b420b785` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-08daa256-65fc-47bb-abba-d5daccfdf455` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-511eafcd-4480-4b33-a52e-d5e9e788844d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-3e177f59-f638-4df9-8304-acc43bdf6e65` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-b6d83a31-6fea-45a2-b3c5-d65972e97ef8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68a15a5f-9599-41a8-9c40-73c91f4f28ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68a15a5f-9599-41a8-9c40-73c91f4f28ef
Content-Type: application/json

--- request body ---
{"handle":"qa-deba69f8bf6a","displayName":"QA deba69f8bf6a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-68a15a5f-9599-41a8-9c40-73c91f4f28ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-deba69f8bf6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6b54bad-ad6e-4dbc-9a71-ec85428f3b07","handle":"qa-deba69f8bf6a","displayName":"QA deba69f8bf6a","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.480496026Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a793c35e-287a-4af2-95dc-fa3dc32f827c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a793c35e-287a-4af2-95dc-fa3dc32f827c
Content-Type: application/json

--- request body ---
{"handle":"qa-3fcd8acd3744","displayName":"QA 3fcd8acd3744","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a793c35e-287a-4af2-95dc-fa3dc32f827c
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
Location: /v1/accounts/qa-3fcd8acd3744
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8c0206f-0af4-4d22-ab77-2fad0744f17d","handle":"qa-3fcd8acd3744","displayName":"QA 3fcd8acd3744","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.548038845Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eb481263-1d6d-4483-9805-ffc5ad4d56db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb481263-1d6d-4483-9805-ffc5ad4d56db
Content-Type: application/json

--- request body ---
{"handle":"qa-deba69f8bf6a","password":"****"}

--- response: 200 in 74 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb481263-1d6d-4483-9805-ffc5ad4d56db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6b54bad-ad6e-4dbc-9a71-ec85428f3b07"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8ff49622-de28-469e-bacc-c50e0ada1bed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ff49622-de28-469e-bacc-c50e0ada1bed
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3fcd8acd3744","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ff49622-de28-469e-bacc-c50e0ada1bed
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
Location: /v1/conversations/cnv_74e04e23-f687-4d9e-86ba-2e8a38e0c8cf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_74e04e23-f687-4d9e-86ba-2e8a38e0c8cf","subject":"Error contract","status":"open","region":"eu","participants":["qa-deba69f8bf6a","qa-3fcd8acd3744"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.663177216Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-deba69f8bf6a
correlation: qa-e5af47b2-c078-4349-9d97-ea3ffc8aeded

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c4ed7baa-b227-4f1b-ae23-a5add8f9350a
X-Correlation-Id: qa-e5af47b2-c078-4349-9d97-ea3ffc8aeded
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5af47b2-c078-4349-9d97-ea3ffc8aeded
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-deba69f8bf6a","correlationId":"qa-e5af47b2-c078-4349-9d97-ea3ffc8aeded"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4fb1fb28-451b-4ce5-8195-0562b420b785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fb1fb28-451b-4ce5-8195-0562b420b785
Content-Type: application/json

--- request body ---
{"handle":"qa-3fcd8acd3744","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fb1fb28-451b-4ce5-8195-0562b420b785
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8c0206f-0af4-4d22-ab77-2fad0744f17d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08daa256-65fc-47bb-abba-d5daccfdf455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08daa256-65fc-47bb-abba-d5daccfdf455
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08daa256-65fc-47bb-abba-d5daccfdf455
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
correlation: qa-511eafcd-4480-4b33-a52e-d5e9e788844d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-511eafcd-4480-4b33-a52e-d5e9e788844d
Content-Type: application/json

--- request body ---
{"handle":"qa-3fcd8acd3744","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-511eafcd-4480-4b33-a52e-d5e9e788844d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-511eafcd-4480-4b33-a52e-d5e9e788844d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e177f59-f638-4df9-8304-acc43bdf6e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e177f59-f638-4df9-8304-acc43bdf6e65
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e177f59-f638-4df9-8304-acc43bdf6e65
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
correlation: qa-b6d83a31-6fea-45a2-b3c5-d65972e97ef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6d83a31-6fea-45a2-b3c5-d65972e97ef8
Content-Type: application/json

--- request body ---
{"handle":"qa-deba69f8bf6a","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6d83a31-6fea-45a2-b3c5-d65972e97ef8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6d83a31-6fea-45a2-b3c5-d65972e97ef8"}
```
