# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 487 | `qa-74d990b5-62a0-420e-85d0-41a654882819` |
| 2 | `POST /v1/auth/token` | 200 | 58 | `qa-23d21549-c426-4c44-a6bd-cc47bfb61d92` |
| 3 | `GET /v1/accounts/me` | 200 | 44 | `qa-33d47923-7e37-4e27-ad85-d1c7b2d5257c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-9097e51f-437d-4fb8-ba52-1d8f7ca51ad7` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-ccd3b48b-534f-4b3c-abfd-df1f749ad93c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-74d990b5-62a0-420e-85d0-41a654882819

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74d990b5-62a0-420e-85d0-41a654882819
Content-Type: application/json

--- request body ---
{"handle":"qa-c0bddcc22abb","displayName":"QA c0bddcc22abb","password":"****","region":"us"}

--- response: 201 in 487 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-74d990b5-62a0-420e-85d0-41a654882819
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-c0bddcc22abb
X-Served-Region: us
Content-Length: 181

{"id":"acc_8fd4e3ac-68aa-4a25-b54f-3b3cdc4d91cc","handle":"qa-c0bddcc22abb","displayName":"QA c0bddcc22abb","region":"us","role":"user","createdAt":"2026-11-20T10:10:02.180811429Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-23d21549-c426-4c44-a6bd-cc47bfb61d92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23d21549-c426-4c44-a6bd-cc47bfb61d92
Content-Type: application/json

--- request body ---
{"handle":"qa-c0bddcc22abb","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-23d21549-c426-4c44-a6bd-cc47bfb61d92
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fd4e3ac-68aa-4a25-b54f-3b3cdc4d91cc"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-33d47923-7e37-4e27-ad85-d1c7b2d5257c

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-33d47923-7e37-4e27-ad85-d1c7b2d5257c
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-33d47923-7e37-4e27-ad85-d1c7b2d5257c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_8fd4e3ac-68aa-4a25-b54f-3b3cdc4d91cc","handle":"qa-c0bddcc22abb","displayName":"QA c0bddcc22abb","region":"us","role":"user","createdAt":"2026-11-20T10:10:02.180811429Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9097e51f-437d-4fb8-ba52-1d8f7ca51ad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9097e51f-437d-4fb8-ba52-1d8f7ca51ad7
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9097e51f-437d-4fb8-ba52-1d8f7ca51ad7
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ccd3b48b-534f-4b3c-abfd-df1f749ad93c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccd3b48b-534f-4b3c-abfd-df1f749ad93c
Content-Type: application/json

--- request body ---
{"handle":"qa-c0bddcc22abb","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccd3b48b-534f-4b3c-abfd-df1f749ad93c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccd3b48b-534f-4b3c-abfd-df1f749ad93c"}
```
