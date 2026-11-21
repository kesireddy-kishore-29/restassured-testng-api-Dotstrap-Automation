# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-c598fc18-1a27-495d-a696-b4962d07f91a` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-d334a22c-8264-41f0-ac62-fdcb7bb108d8` |
| 3 | `GET /v1/admin/stats` | 403 | 13 | `qa-25ea0897-3970-47f2-a44e-8e65ab768755` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-95cf912d-ebb0-441f-819f-8bac0d8882b6` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-b5172495-1c71-4a65-9185-39476375b4de` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c598fc18-1a27-495d-a696-b4962d07f91a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c598fc18-1a27-495d-a696-b4962d07f91a
Content-Type: application/json

--- request body ---
{"handle":"qa-b40141c929be","displayName":"QA b40141c929be","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c598fc18-1a27-495d-a696-b4962d07f91a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-b40141c929be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e92d8281-2bb2-4820-95f4-3f702188541c","handle":"qa-b40141c929be","displayName":"QA b40141c929be","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.918099604Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d334a22c-8264-41f0-ac62-fdcb7bb108d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d334a22c-8264-41f0-ac62-fdcb7bb108d8
Content-Type: application/json

--- request body ---
{"handle":"qa-b40141c929be","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d334a22c-8264-41f0-ac62-fdcb7bb108d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e92d8281-2bb2-4820-95f4-3f702188541c"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-25ea0897-3970-47f2-a44e-8e65ab768755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ea0897-3970-47f2-a44e-8e65ab768755
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25ea0897-3970-47f2-a44e-8e65ab768755
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-25ea0897-3970-47f2-a44e-8e65ab768755"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95cf912d-ebb0-441f-819f-8bac0d8882b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95cf912d-ebb0-441f-819f-8bac0d8882b6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95cf912d-ebb0-441f-819f-8bac0d8882b6
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b5172495-1c71-4a65-9185-39476375b4de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5172495-1c71-4a65-9185-39476375b4de
Content-Type: application/json

--- request body ---
{"handle":"qa-b40141c929be","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5172495-1c71-4a65-9185-39476375b4de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5172495-1c71-4a65-9185-39476375b4de"}
```
