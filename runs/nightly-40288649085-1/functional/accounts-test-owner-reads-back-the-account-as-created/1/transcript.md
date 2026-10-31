# Transcript: The owner reads back exactly what was created

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#ownerReadsBackTheAccountAsCreated` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-a979fc6c-1a22-44b0-8830-0cfac58d349b` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-deec6718-509d-46f9-aef0-1783c59641fe` |
| 3 | `GET /v1/accounts/me` | 200 | 9 | `qa-179a1293-957a-4f62-be44-e37e43daf7db` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6f12aaad-832f-43ce-a5d4-dd93a033bae5` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-1e665a73-174d-4619-aa63-afbdf1fec734` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a979fc6c-1a22-44b0-8830-0cfac58d349b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a979fc6c-1a22-44b0-8830-0cfac58d349b
Content-Type: application/json

--- request body ---
{"handle":"qa-7708703c6a26","displayName":"QA 7708703c6a26","password":"****","region":"in"}

--- response: 201 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a979fc6c-1a22-44b0-8830-0cfac58d349b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-7708703c6a26
X-Served-Region: in
Content-Length: 181

{"id":"acc_98da4ddf-5fe6-49e2-a04f-612685a11f21","handle":"qa-7708703c6a26","displayName":"QA 7708703c6a26","region":"in","role":"user","createdAt":"2026-10-26T07:54:42.841241381Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-deec6718-509d-46f9-aef0-1783c59641fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deec6718-509d-46f9-aef0-1783c59641fe
Content-Type: application/json

--- request body ---
{"handle":"qa-7708703c6a26","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-deec6718-509d-46f9-aef0-1783c59641fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98da4ddf-5fe6-49e2-a04f-612685a11f21"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-179a1293-957a-4f62-be44-e37e43daf7db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-179a1293-957a-4f62-be44-e37e43daf7db
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-179a1293-957a-4f62-be44-e37e43daf7db
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
X-Served-Region: in
Content-Length: 181

{"id":"acc_98da4ddf-5fe6-49e2-a04f-612685a11f21","handle":"qa-7708703c6a26","displayName":"QA 7708703c6a26","region":"in","role":"user","createdAt":"2026-10-26T07:54:42.841241381Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f12aaad-832f-43ce-a5d4-dd93a033bae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f12aaad-832f-43ce-a5d4-dd93a033bae5
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f12aaad-832f-43ce-a5d4-dd93a033bae5
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1e665a73-174d-4619-aa63-afbdf1fec734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e665a73-174d-4619-aa63-afbdf1fec734
Content-Type: application/json

--- request body ---
{"handle":"qa-7708703c6a26","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e665a73-174d-4619-aa63-afbdf1fec734
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e665a73-174d-4619-aa63-afbdf1fec734"}
```
