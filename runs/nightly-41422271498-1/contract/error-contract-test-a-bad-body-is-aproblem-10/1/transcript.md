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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-163fc217-cb3c-40ba-b7f7-7e5e06abc886` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-d5955ddf-af6c-49da-b1af-ad6911bd91a0` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-a21c8a30-863f-43b2-8303-697d8753cdd4` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-4e22c5c1-5834-4eac-9a16-9658a8667e62` |
| 5 | `POST /v1/conversations` | 415 | 19 | `qa-75680044-800b-45e4-a3f8-040911cd3044` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-66ed6a54-9bc8-4ccb-8481-c256934f4749` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f47f0a58-144b-4f0a-a7c3-38fb7009464e` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-893e3623-df0a-4bc3-a79a-cf91bb5bac6f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d01d880e-1c26-4f4a-8855-78bf8c720438` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-79241cd6-7027-47c5-a158-5321d1846485` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-163fc217-cb3c-40ba-b7f7-7e5e06abc886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-163fc217-cb3c-40ba-b7f7-7e5e06abc886
Content-Type: application/json

--- request body ---
{"handle":"qa-b916a9c3cc6f","displayName":"QA b916a9c3cc6f","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-163fc217-cb3c-40ba-b7f7-7e5e06abc886
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Location: /v1/accounts/qa-b916a9c3cc6f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_577881f2-5701-4ba7-b34b-7f6a9d8d57e5","handle":"qa-b916a9c3cc6f","displayName":"QA b916a9c3cc6f","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.808766426Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d5955ddf-af6c-49da-b1af-ad6911bd91a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5955ddf-af6c-49da-b1af-ad6911bd91a0
Content-Type: application/json

--- request body ---
{"handle":"qa-6b77dd0b38d0","displayName":"QA 6b77dd0b38d0","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5955ddf-af6c-49da-b1af-ad6911bd91a0
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
Location: /v1/accounts/qa-6b77dd0b38d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e0352cc-d984-4627-88e5-7099e26e3db9","handle":"qa-6b77dd0b38d0","displayName":"QA 6b77dd0b38d0","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.867459295Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a21c8a30-863f-43b2-8303-697d8753cdd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a21c8a30-863f-43b2-8303-697d8753cdd4
Content-Type: application/json

--- request body ---
{"handle":"qa-b916a9c3cc6f","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a21c8a30-863f-43b2-8303-697d8753cdd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_577881f2-5701-4ba7-b34b-7f6a9d8d57e5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4e22c5c1-5834-4eac-9a16-9658a8667e62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e22c5c1-5834-4eac-9a16-9658a8667e62
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6b77dd0b38d0","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e22c5c1-5834-4eac-9a16-9658a8667e62
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
Location: /v1/conversations/cnv_3ed1e874-ab40-410c-8e38-9f3b822a43a2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3ed1e874-ab40-410c-8e38-9f3b822a43a2","subject":"Error contract","status":"open","region":"eu","participants":["qa-b916a9c3cc6f","qa-6b77dd0b38d0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.929863746Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-75680044-800b-45e4-a3f8-040911cd3044

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75680044-800b-45e4-a3f8-040911cd3044
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75680044-800b-45e4-a3f8-040911cd3044
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-75680044-800b-45e4-a3f8-040911cd3044"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-66ed6a54-9bc8-4ccb-8481-c256934f4749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ed6a54-9bc8-4ccb-8481-c256934f4749
Content-Type: application/json

--- request body ---
{"handle":"qa-6b77dd0b38d0","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-66ed6a54-9bc8-4ccb-8481-c256934f4749
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e0352cc-d984-4627-88e5-7099e26e3db9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f47f0a58-144b-4f0a-a7c3-38fb7009464e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f47f0a58-144b-4f0a-a7c3-38fb7009464e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f47f0a58-144b-4f0a-a7c3-38fb7009464e
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
correlation: qa-893e3623-df0a-4bc3-a79a-cf91bb5bac6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-893e3623-df0a-4bc3-a79a-cf91bb5bac6f
Content-Type: application/json

--- request body ---
{"handle":"qa-6b77dd0b38d0","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-893e3623-df0a-4bc3-a79a-cf91bb5bac6f
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-893e3623-df0a-4bc3-a79a-cf91bb5bac6f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d01d880e-1c26-4f4a-8855-78bf8c720438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01d880e-1c26-4f4a-8855-78bf8c720438
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d01d880e-1c26-4f4a-8855-78bf8c720438
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
correlation: qa-79241cd6-7027-47c5-a158-5321d1846485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79241cd6-7027-47c5-a158-5321d1846485
Content-Type: application/json

--- request body ---
{"handle":"qa-b916a9c3cc6f","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79241cd6-7027-47c5-a158-5321d1846485
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79241cd6-7027-47c5-a158-5321d1846485"}
```
