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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-c421ec08-adda-433f-bbed-23d8a61dbf46` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-c6be35d6-92be-499d-a899-f77938e13506` |
| 3 | `GET /v1/conversations/{id}` | 404 | 14 | `qa-13b53c4e-a378-432b-b1a6-2d21a6b54fa6` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 9 | `qa-2b5cf5b8-c0a3-41d1-ad4a-60bc98eab42c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-60c521b0-b46c-43d6-aa0e-2da51644842e` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-fa06bf65-b42b-4ed7-a47c-49ad30fa6c9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c421ec08-adda-433f-bbed-23d8a61dbf46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c421ec08-adda-433f-bbed-23d8a61dbf46
Content-Type: application/json

--- request body ---
{"handle":"qa-abde54af11c4","displayName":"QA abde54af11c4","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c421ec08-adda-433f-bbed-23d8a61dbf46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-abde54af11c4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c5bb5a5-22ac-4b4b-b363-4a769848fb7e","handle":"qa-abde54af11c4","displayName":"QA abde54af11c4","region":"eu","role":"user","createdAt":"2026-11-03T09:41:37.836671767Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c6be35d6-92be-499d-a899-f77938e13506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6be35d6-92be-499d-a899-f77938e13506
Content-Type: application/json

--- request body ---
{"handle":"qa-abde54af11c4","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6be35d6-92be-499d-a899-f77938e13506
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c5bb5a5-22ac-4b4b-b363-4a769848fb7e"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-13b53c4e-a378-432b-b1a6-2d21a6b54fa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b53c4e-a378-432b-b1a6-2d21a6b54fa6
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13b53c4e-a378-432b-b1a6-2d21a6b54fa6
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-13b53c4e-a378-432b-b1a6-2d21a6b54fa6"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-2b5cf5b8-c0a3-41d1-ad4a-60bc98eab42c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b5cf5b8-c0a3-41d1-ad4a-60bc98eab42c
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b5cf5b8-c0a3-41d1-ad4a-60bc98eab42c
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-2b5cf5b8-c0a3-41d1-ad4a-60bc98eab42c"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60c521b0-b46c-43d6-aa0e-2da51644842e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60c521b0-b46c-43d6-aa0e-2da51644842e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60c521b0-b46c-43d6-aa0e-2da51644842e
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
correlation: qa-fa06bf65-b42b-4ed7-a47c-49ad30fa6c9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa06bf65-b42b-4ed7-a47c-49ad30fa6c9d
Content-Type: application/json

--- request body ---
{"handle":"qa-abde54af11c4","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa06bf65-b42b-4ed7-a47c-49ad30fa6c9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa06bf65-b42b-4ed7-a47c-49ad30fa6c9d"}
```
