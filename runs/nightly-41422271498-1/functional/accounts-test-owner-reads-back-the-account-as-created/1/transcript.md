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
| 1 | `POST /v1/accounts` | 201 | 336 | `qa-e3d6d13c-f6de-45a2-ae46-49493ffb46ea` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-25652882-36da-4c2d-bf14-bac886a1ee85` |
| 3 | `GET /v1/accounts/me` | 200 | 37 | `qa-d4e4ba22-6c17-4e37-996e-5ca58465d2fe` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-dfe17eec-09e3-4a54-9974-90413930ca22` |
| 5 | `POST /v1/auth/token` | 401 | 24 | `qa-0bf90b9f-4e6f-4ba4-a457-9f5ab2fcb515` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e3d6d13c-f6de-45a2-ae46-49493ffb46ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3d6d13c-f6de-45a2-ae46-49493ffb46ea
Content-Type: application/json

--- request body ---
{"handle":"qa-f7e4a826d09f","displayName":"QA f7e4a826d09f","password":"****","region":"in"}

--- response: 201 in 336 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3d6d13c-f6de-45a2-ae46-49493ffb46ea
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
Location: /v1/accounts/qa-f7e4a826d09f
X-Served-Region: in
Content-Length: 181

{"id":"acc_2d8ee4dd-bb7a-4d5f-a0ff-166e654b803d","handle":"qa-f7e4a826d09f","displayName":"QA f7e4a826d09f","region":"in","role":"user","createdAt":"2026-11-02T09:39:10.478316474Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-25652882-36da-4c2d-bf14-bac886a1ee85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25652882-36da-4c2d-bf14-bac886a1ee85
Content-Type: application/json

--- request body ---
{"handle":"qa-f7e4a826d09f","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-25652882-36da-4c2d-bf14-bac886a1ee85
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d8ee4dd-bb7a-4d5f-a0ff-166e654b803d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4e4ba22-6c17-4e37-996e-5ca58465d2fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4e4ba22-6c17-4e37-996e-5ca58465d2fe
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Mon, 02 Nov 2026 09:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4e4ba22-6c17-4e37-996e-5ca58465d2fe
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

{"id":"acc_2d8ee4dd-bb7a-4d5f-a0ff-166e654b803d","handle":"qa-f7e4a826d09f","displayName":"QA f7e4a826d09f","region":"in","role":"user","createdAt":"2026-11-02T09:39:10.478316474Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dfe17eec-09e3-4a54-9974-90413930ca22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfe17eec-09e3-4a54-9974-90413930ca22
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dfe17eec-09e3-4a54-9974-90413930ca22
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
correlation: qa-0bf90b9f-4e6f-4ba4-a457-9f5ab2fcb515

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bf90b9f-4e6f-4ba4-a457-9f5ab2fcb515
Content-Type: application/json

--- request body ---
{"handle":"qa-f7e4a826d09f","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 02 Nov 2026 09:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bf90b9f-4e6f-4ba4-a457-9f5ab2fcb515
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bf90b9f-4e6f-4ba4-a457-9f5ab2fcb515"}
```
