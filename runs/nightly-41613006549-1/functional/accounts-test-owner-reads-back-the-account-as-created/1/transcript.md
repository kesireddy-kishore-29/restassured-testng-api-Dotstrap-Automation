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
| 1 | `POST /v1/accounts` | 201 | 411 | `qa-97a34ab1-c597-4faa-994b-dae3e19c18da` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-aae459c7-bdae-4c0d-9cd3-803326239045` |
| 3 | `GET /v1/accounts/me` | 200 | 66 | `qa-d9bfe083-e3c2-4223-92d5-84a130671936` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-e3afb3a8-8bb4-424b-b8c3-7b26fb9817df` |
| 5 | `POST /v1/auth/token` | 401 | 64 | `qa-92c0a531-07a8-4c55-a67c-c58a9cf14013` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97a34ab1-c597-4faa-994b-dae3e19c18da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a34ab1-c597-4faa-994b-dae3e19c18da
Content-Type: application/json

--- request body ---
{"handle":"qa-bdedd6dcb7be","displayName":"QA bdedd6dcb7be","password":"****","region":"in"}

--- response: 201 in 411 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-97a34ab1-c597-4faa-994b-dae3e19c18da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-bdedd6dcb7be
X-Served-Region: in
Content-Length: 181

{"id":"acc_933347cb-b876-4aaa-851b-64dae8e33795","handle":"qa-bdedd6dcb7be","displayName":"QA bdedd6dcb7be","region":"in","role":"user","createdAt":"2026-11-03T09:41:46.220859981Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-aae459c7-bdae-4c0d-9cd3-803326239045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aae459c7-bdae-4c0d-9cd3-803326239045
Content-Type: application/json

--- request body ---
{"handle":"qa-bdedd6dcb7be","password":"****"}

--- response: 200 in 56 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-aae459c7-bdae-4c0d-9cd3-803326239045
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_933347cb-b876-4aaa-851b-64dae8e33795"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9bfe083-e3c2-4223-92d5-84a130671936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9bfe083-e3c2-4223-92d5-84a130671936
Content-Type: application/json

--- response: 200 in 66 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9bfe083-e3c2-4223-92d5-84a130671936
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

{"id":"acc_933347cb-b876-4aaa-851b-64dae8e33795","handle":"qa-bdedd6dcb7be","displayName":"QA bdedd6dcb7be","region":"in","role":"user","createdAt":"2026-11-03T09:41:46.220859981Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3afb3a8-8bb4-424b-b8c3-7b26fb9817df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3afb3a8-8bb4-424b-b8c3-7b26fb9817df
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3afb3a8-8bb4-424b-b8c3-7b26fb9817df
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
correlation: qa-92c0a531-07a8-4c55-a67c-c58a9cf14013

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c0a531-07a8-4c55-a67c-c58a9cf14013
Content-Type: application/json

--- request body ---
{"handle":"qa-bdedd6dcb7be","password":"****"}

--- response: 401 in 64 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92c0a531-07a8-4c55-a67c-c58a9cf14013
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92c0a531-07a8-4c55-a67c-c58a9cf14013"}
```
