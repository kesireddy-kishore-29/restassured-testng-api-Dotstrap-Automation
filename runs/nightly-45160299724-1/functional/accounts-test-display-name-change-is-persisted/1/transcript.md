# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 422 | `qa-d9661f3d-efcd-43e9-b01d-1df496d68022` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-0ceed997-fcd7-4d87-8623-1db3e34b4084` |
| 3 | `PATCH /v1/accounts/me` | 200 | 42 | `qa-817da586-9829-421d-af9c-bf8b52c4c877` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-6c3f6d64-bc55-4395-885d-6862baf70478` |
| 5 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-eb4858dc-6440-4b6d-809f-278acd06ef4b` |
| 6 | `POST /v1/auth/token` | 401 | 24 | `qa-e838a792-7973-4357-82d3-bb100ca0282b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d9661f3d-efcd-43e9-b01d-1df496d68022

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9661f3d-efcd-43e9-b01d-1df496d68022
Content-Type: application/json

--- request body ---
{"handle":"qa-d4ab5343e65d","displayName":"QA d4ab5343e65d","password":"****","region":"eu"}

--- response: 201 in 422 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9661f3d-efcd-43e9-b01d-1df496d68022
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
Location: /v1/accounts/qa-d4ab5343e65d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c82db225-c9c7-4e33-998b-19a123952977","handle":"qa-d4ab5343e65d","displayName":"QA d4ab5343e65d","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.254940616Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0ceed997-fcd7-4d87-8623-1db3e34b4084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ceed997-fcd7-4d87-8623-1db3e34b4084
Content-Type: application/json

--- request body ---
{"handle":"qa-d4ab5343e65d","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ceed997-fcd7-4d87-8623-1db3e34b4084
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c82db225-c9c7-4e33-998b-19a123952977"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-817da586-9829-421d-af9c-bf8b52c4c877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-817da586-9829-421d-af9c-bf8b52c4c877
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 42 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-817da586-9829-421d-af9c-bf8b52c4c877
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
Content-Length: 179

{"id":"acc_c82db225-c9c7-4e33-998b-19a123952977","handle":"qa-d4ab5343e65d","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.254940616Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c3f6d64-bc55-4395-885d-6862baf70478

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c3f6d64-bc55-4395-885d-6862baf70478
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c3f6d64-bc55-4395-885d-6862baf70478
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
Content-Length: 179

{"id":"acc_c82db225-c9c7-4e33-998b-19a123952977","handle":"qa-d4ab5343e65d","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.254940616Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb4858dc-6440-4b6d-809f-278acd06ef4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb4858dc-6440-4b6d-809f-278acd06ef4b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb4858dc-6440-4b6d-809f-278acd06ef4b
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
correlation: qa-e838a792-7973-4357-82d3-bb100ca0282b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e838a792-7973-4357-82d3-bb100ca0282b
Content-Type: application/json

--- request body ---
{"handle":"qa-d4ab5343e65d","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e838a792-7973-4357-82d3-bb100ca0282b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e838a792-7973-4357-82d3-bb100ca0282b"}
```
