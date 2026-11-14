# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-60023bc5-02e0-43a7-8095-0446a186ace8` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-396d8c50-eabf-47fc-8d4d-15ca31c03abe` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-44026e10-4bf0-49a5-b1c8-3335f6a66e3a` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-ef547b44-a52b-47ac-b26e-85ebdb265302` |
| 5 | `POST /v1/conversations` | 415 | 17 | `qa-22d420b1-7518-4cc9-9da8-2d0df3814bd0` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-9e0bde18-2dc7-4a3c-a66a-03b9aea0409a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-01347d88-d238-4304-a624-f63cd45726c6` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-040531d1-050d-4b71-9814-6d5a66092ecc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-9d283b94-e2a0-496f-a996-d296b798502a` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-3319a81c-257b-4426-9a14-5bf9955e694e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-60023bc5-02e0-43a7-8095-0446a186ace8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60023bc5-02e0-43a7-8095-0446a186ace8
Content-Type: application/json

--- request body ---
{"handle":"qa-ffb1904cd627","displayName":"QA ffb1904cd627","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-60023bc5-02e0-43a7-8095-0446a186ace8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-ffb1904cd627
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d321a9d9-b3d2-4397-8201-74fdc5fbf074","handle":"qa-ffb1904cd627","displayName":"QA ffb1904cd627","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.740015958Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-396d8c50-eabf-47fc-8d4d-15ca31c03abe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-396d8c50-eabf-47fc-8d4d-15ca31c03abe
Content-Type: application/json

--- request body ---
{"handle":"qa-a17c55bdf0f0","displayName":"QA a17c55bdf0f0","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-396d8c50-eabf-47fc-8d4d-15ca31c03abe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Location: /v1/accounts/qa-a17c55bdf0f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_580a6407-5fa4-4f91-8dab-e853606abf48","handle":"qa-a17c55bdf0f0","displayName":"QA a17c55bdf0f0","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.788057705Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-44026e10-4bf0-49a5-b1c8-3335f6a66e3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44026e10-4bf0-49a5-b1c8-3335f6a66e3a
Content-Type: application/json

--- request body ---
{"handle":"qa-ffb1904cd627","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-44026e10-4bf0-49a5-b1c8-3335f6a66e3a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d321a9d9-b3d2-4397-8201-74fdc5fbf074"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ef547b44-a52b-47ac-b26e-85ebdb265302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef547b44-a52b-47ac-b26e-85ebdb265302
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a17c55bdf0f0","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef547b44-a52b-47ac-b26e-85ebdb265302
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
Location: /v1/conversations/cnv_5ba0571f-85f6-44a8-8bae-a99cb9bfd705
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5ba0571f-85f6-44a8-8bae-a99cb9bfd705","subject":"Error contract","status":"open","region":"eu","participants":["qa-ffb1904cd627","qa-a17c55bdf0f0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.892193322Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-22d420b1-7518-4cc9-9da8-2d0df3814bd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22d420b1-7518-4cc9-9da8-2d0df3814bd0
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22d420b1-7518-4cc9-9da8-2d0df3814bd0
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-22d420b1-7518-4cc9-9da8-2d0df3814bd0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9e0bde18-2dc7-4a3c-a66a-03b9aea0409a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0bde18-2dc7-4a3c-a66a-03b9aea0409a
Content-Type: application/json

--- request body ---
{"handle":"qa-a17c55bdf0f0","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e0bde18-2dc7-4a3c-a66a-03b9aea0409a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_580a6407-5fa4-4f91-8dab-e853606abf48"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01347d88-d238-4304-a624-f63cd45726c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01347d88-d238-4304-a624-f63cd45726c6
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01347d88-d238-4304-a624-f63cd45726c6
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
correlation: qa-040531d1-050d-4b71-9814-6d5a66092ecc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-040531d1-050d-4b71-9814-6d5a66092ecc
Content-Type: application/json

--- request body ---
{"handle":"qa-a17c55bdf0f0","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-040531d1-050d-4b71-9814-6d5a66092ecc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-040531d1-050d-4b71-9814-6d5a66092ecc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d283b94-e2a0-496f-a996-d296b798502a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d283b94-e2a0-496f-a996-d296b798502a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d283b94-e2a0-496f-a996-d296b798502a
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
correlation: qa-3319a81c-257b-4426-9a14-5bf9955e694e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3319a81c-257b-4426-9a14-5bf9955e694e
Content-Type: application/json

--- request body ---
{"handle":"qa-ffb1904cd627","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3319a81c-257b-4426-9a14-5bf9955e694e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3319a81c-257b-4426-9a14-5bf9955e694e"}
```
