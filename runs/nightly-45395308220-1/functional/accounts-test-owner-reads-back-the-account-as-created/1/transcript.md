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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-aa5540d7-388b-4ed3-95c2-598dfa9030f9` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-fa1cbdf3-ffb7-420e-b60d-9fa5f4c3cd12` |
| 3 | `GET /v1/accounts/me` | 200 | 7 | `qa-382ca8fb-7bd3-4e60-9eb8-147a38d1f4e1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-1d54e1d2-95ec-4589-b453-9f2505bfe894` |
| 5 | `POST /v1/auth/token` | 401 | 25 | `qa-faafd37a-6467-4e52-bd1a-daa40df172fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa5540d7-388b-4ed3-95c2-598dfa9030f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa5540d7-388b-4ed3-95c2-598dfa9030f9
Content-Type: application/json

--- request body ---
{"handle":"qa-c7ffdbe55aac","displayName":"QA c7ffdbe55aac","password":"****","region":"in"}

--- response: 201 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa5540d7-388b-4ed3-95c2-598dfa9030f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-c7ffdbe55aac
X-Served-Region: in
Content-Length: 181

{"id":"acc_c5a365f2-f78d-4d9b-b01c-f14bce542ed1","handle":"qa-c7ffdbe55aac","displayName":"QA c7ffdbe55aac","region":"in","role":"user","createdAt":"2026-11-24T12:38:05.116299082Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fa1cbdf3-ffb7-420e-b60d-9fa5f4c3cd12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa1cbdf3-ffb7-420e-b60d-9fa5f4c3cd12
Content-Type: application/json

--- request body ---
{"handle":"qa-c7ffdbe55aac","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa1cbdf3-ffb7-420e-b60d-9fa5f4c3cd12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5a365f2-f78d-4d9b-b01c-f14bce542ed1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-382ca8fb-7bd3-4e60-9eb8-147a38d1f4e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-382ca8fb-7bd3-4e60-9eb8-147a38d1f4e1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-382ca8fb-7bd3-4e60-9eb8-147a38d1f4e1
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

{"id":"acc_c5a365f2-f78d-4d9b-b01c-f14bce542ed1","handle":"qa-c7ffdbe55aac","displayName":"QA c7ffdbe55aac","region":"in","role":"user","createdAt":"2026-11-24T12:38:05.116299082Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d54e1d2-95ec-4589-b453-9f2505bfe894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d54e1d2-95ec-4589-b453-9f2505bfe894
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d54e1d2-95ec-4589-b453-9f2505bfe894
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
correlation: qa-faafd37a-6467-4e52-bd1a-daa40df172fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faafd37a-6467-4e52-bd1a-daa40df172fb
Content-Type: application/json

--- request body ---
{"handle":"qa-c7ffdbe55aac","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faafd37a-6467-4e52-bd1a-daa40df172fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-faafd37a-6467-4e52-bd1a-daa40df172fb"}
```
