# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 427 | `qa-d0b95b69-c7a6-4c84-932d-89d7b2bf32e3` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-c5073908-5256-44b8-a013-af58203c531a` |
| 3 | `GET /v1/conversations/{id}` | 404 | 73 | `qa-035a6e0a-b16f-4b23-88f8-13a2575ed1d1` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 29 | `qa-e58dfc55-e73b-4100-80e0-84fee032e935` |
| 5 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-209593aa-d68e-4330-bb1f-a345b45afe23` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-c72fd754-5b63-4091-8144-f604fc319eb3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0b95b69-c7a6-4c84-932d-89d7b2bf32e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0b95b69-c7a6-4c84-932d-89d7b2bf32e3
Content-Type: application/json

--- request body ---
{"handle":"qa-58ff60c251ee","displayName":"QA 58ff60c251ee","password":"****","region":"eu"}

--- response: 201 in 427 ms ---
Date: Wed, 11 Nov 2026 09:34:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0b95b69-c7a6-4c84-932d-89d7b2bf32e3
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
Location: /v1/accounts/qa-58ff60c251ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b7ecdd1-af3b-4f41-aa44-7a16aa9a7ed9","handle":"qa-58ff60c251ee","displayName":"QA 58ff60c251ee","region":"eu","role":"user","createdAt":"2026-11-11T09:34:29.182997527Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c5073908-5256-44b8-a013-af58203c531a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5073908-5256-44b8-a013-af58203c531a
Content-Type: application/json

--- request body ---
{"handle":"qa-58ff60c251ee","password":"****"}

--- response: 200 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5073908-5256-44b8-a013-af58203c531a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b7ecdd1-af3b-4f41-aa44-7a16aa9a7ed9"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-035a6e0a-b16f-4b23-88f8-13a2575ed1d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-035a6e0a-b16f-4b23-88f8-13a2575ed1d1
Content-Type: application/json

--- response: 404 in 73 ms ---
Date: Wed, 11 Nov 2026 09:34:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-035a6e0a-b16f-4b23-88f8-13a2575ed1d1
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-035a6e0a-b16f-4b23-88f8-13a2575ed1d1"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-e58dfc55-e73b-4100-80e0-84fee032e935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e58dfc55-e73b-4100-80e0-84fee032e935
Content-Type: application/json

--- response: 404 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e58dfc55-e73b-4100-80e0-84fee032e935
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-e58dfc55-e73b-4100-80e0-84fee032e935"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-209593aa-d68e-4330-bb1f-a345b45afe23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-209593aa-d68e-4330-bb1f-a345b45afe23
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-209593aa-d68e-4330-bb1f-a345b45afe23
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c72fd754-5b63-4091-8144-f604fc319eb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c72fd754-5b63-4091-8144-f604fc319eb3
Content-Type: application/json

--- request body ---
{"handle":"qa-58ff60c251ee","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c72fd754-5b63-4091-8144-f604fc319eb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c72fd754-5b63-4091-8144-f604fc319eb3"}
```
