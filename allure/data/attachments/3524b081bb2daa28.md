# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 247 | `qa-4fc85912-f0ef-4024-8ff0-5b1284155be6` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-02404209-08ae-456f-8b23-4c142ca43a2e` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-61b4e607-bb96-4e74-ab83-25a71075700e` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 21 | `qa-43621002-c591-4729-b2cf-ee49d75c4aa9` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-08e3b5e7-2813-4536-889f-b8f2895c5d08` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 6 | `qa-eabca527-211a-43da-9736-168f9174028d` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-de4e4f08-2e31-4bd4-bea1-5cc6f1c4258c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-cab7aa1b-9144-4d14-8915-bb44cdfe9cb2` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-b33482f7-4f76-4868-a926-090f613d8151` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-1ea094c0-e7cf-49c0-bfdb-0e519ca8b7b8` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-e9044328-a68a-4726-ab75-f2cec04d9ddf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4fc85912-f0ef-4024-8ff0-5b1284155be6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fc85912-f0ef-4024-8ff0-5b1284155be6
Content-Type: application/json

--- request body ---
{"handle":"qa-5afeb5b2876a","displayName":"QA 5afeb5b2876a","password":"****","region":"eu"}

--- response: 201 in 247 ms ---
Date: Sat, 31 Oct 2026 08:31:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fc85912-f0ef-4024-8ff0-5b1284155be6
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
Location: /v1/accounts/qa-5afeb5b2876a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0530628-6c89-46a6-abce-a41bf1181db6","handle":"qa-5afeb5b2876a","displayName":"QA 5afeb5b2876a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:23.871151837Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-02404209-08ae-456f-8b23-4c142ca43a2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02404209-08ae-456f-8b23-4c142ca43a2e
Content-Type: application/json

--- request body ---
{"handle":"qa-bd7f5dce41c9","displayName":"QA bd7f5dce41c9","password":"****","region":"us"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-02404209-08ae-456f-8b23-4c142ca43a2e
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
Location: /v1/accounts/qa-bd7f5dce41c9
X-Served-Region: us
Content-Length: 181

{"id":"acc_f868929e-e549-4c83-a4fc-bf5417f8769a","handle":"qa-bd7f5dce41c9","displayName":"QA bd7f5dce41c9","region":"us","role":"user","createdAt":"2026-10-31T08:31:24.146641429Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-61b4e607-bb96-4e74-ab83-25a71075700e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61b4e607-bb96-4e74-ab83-25a71075700e
Content-Type: application/json

--- request body ---
{"handle":"qa-5afeb5b2876a","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-61b4e607-bb96-4e74-ab83-25a71075700e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0530628-6c89-46a6-abce-a41bf1181db6"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-bd7f5dce41c9
correlation: qa-43621002-c591-4729-b2cf-ee49d75c4aa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43621002-c591-4729-b2cf-ee49d75c4aa9
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-43621002-c591-4729-b2cf-ee49d75c4aa9
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
Content-Length: 74

{"handle":"qa-bd7f5dce41c9","displayName":"QA bd7f5dce41c9","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-bd7f5dce41c9
correlation: qa-08e3b5e7-2813-4536-889f-b8f2895c5d08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08e3b5e7-2813-4536-889f-b8f2895c5d08
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-08e3b5e7-2813-4536-889f-b8f2895c5d08
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
Content-Length: 74

{"handle":"qa-bd7f5dce41c9","displayName":"QA bd7f5dce41c9","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-bd7f5dce41c9
correlation: qa-eabca527-211a-43da-9736-168f9174028d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eabca527-211a-43da-9736-168f9174028d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-eabca527-211a-43da-9736-168f9174028d
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
Content-Length: 74

{"handle":"qa-bd7f5dce41c9","displayName":"QA bd7f5dce41c9","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-de4e4f08-2e31-4bd4-bea1-5cc6f1c4258c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de4e4f08-2e31-4bd4-bea1-5cc6f1c4258c
Content-Type: application/json

--- request body ---
{"handle":"qa-bd7f5dce41c9","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-de4e4f08-2e31-4bd4-bea1-5cc6f1c4258c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f868929e-e549-4c83-a4fc-bf5417f8769a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cab7aa1b-9144-4d14-8915-bb44cdfe9cb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cab7aa1b-9144-4d14-8915-bb44cdfe9cb2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cab7aa1b-9144-4d14-8915-bb44cdfe9cb2
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-b33482f7-4f76-4868-a926-090f613d8151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b33482f7-4f76-4868-a926-090f613d8151
Content-Type: application/json

--- request body ---
{"handle":"qa-bd7f5dce41c9","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b33482f7-4f76-4868-a926-090f613d8151
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b33482f7-4f76-4868-a926-090f613d8151"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ea094c0-e7cf-49c0-bfdb-0e519ca8b7b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea094c0-e7cf-49c0-bfdb-0e519ca8b7b8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ea094c0-e7cf-49c0-bfdb-0e519ca8b7b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-e9044328-a68a-4726-ab75-f2cec04d9ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9044328-a68a-4726-ab75-f2cec04d9ddf
Content-Type: application/json

--- request body ---
{"handle":"qa-5afeb5b2876a","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9044328-a68a-4726-ab75-f2cec04d9ddf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9044328-a68a-4726-ab75-f2cec04d9ddf"}
```
