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
| 1 | `POST /v1/accounts` | 201 | 346 | `qa-526fa01c-2837-4e46-900e-4bbf945b17e1` |
| 2 | `POST /v1/auth/token` | 200 | 43 | `qa-8d57d11a-fbe9-45df-b5e6-e83c68cfa6ec` |
| 3 | `PATCH /v1/accounts/me` | 200 | 39 | `qa-5c0d43aa-2d39-4b7e-8499-32d97b9ff02b` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-d3147156-12b4-43bb-904e-7cdb6f363ac7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-719b8ecf-d4c2-4702-b890-8033f749bf2b` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-f2a439a0-bd94-4893-8b8d-c9e27c2b7f37` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-526fa01c-2837-4e46-900e-4bbf945b17e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-526fa01c-2837-4e46-900e-4bbf945b17e1
Content-Type: application/json

--- request body ---
{"handle":"qa-4d7ad555cab0","displayName":"QA 4d7ad555cab0","password":"****","region":"eu"}

--- response: 201 in 346 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-526fa01c-2837-4e46-900e-4bbf945b17e1
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
Location: /v1/accounts/qa-4d7ad555cab0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_741d7dcd-8b0c-4f25-93eb-0328f53dca93","handle":"qa-4d7ad555cab0","displayName":"QA 4d7ad555cab0","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.124948708Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8d57d11a-fbe9-45df-b5e6-e83c68cfa6ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d57d11a-fbe9-45df-b5e6-e83c68cfa6ec
Content-Type: application/json

--- request body ---
{"handle":"qa-4d7ad555cab0","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d57d11a-fbe9-45df-b5e6-e83c68cfa6ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_741d7dcd-8b0c-4f25-93eb-0328f53dca93"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-5c0d43aa-2d39-4b7e-8499-32d97b9ff02b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c0d43aa-2d39-4b7e-8499-32d97b9ff02b
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c0d43aa-2d39-4b7e-8499-32d97b9ff02b
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

{"id":"acc_741d7dcd-8b0c-4f25-93eb-0328f53dca93","handle":"qa-4d7ad555cab0","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.124948708Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3147156-12b4-43bb-904e-7cdb6f363ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3147156-12b4-43bb-904e-7cdb6f363ac7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3147156-12b4-43bb-904e-7cdb6f363ac7
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

{"id":"acc_741d7dcd-8b0c-4f25-93eb-0328f53dca93","handle":"qa-4d7ad555cab0","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.124948708Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-719b8ecf-d4c2-4702-b890-8033f749bf2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719b8ecf-d4c2-4702-b890-8033f749bf2b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-719b8ecf-d4c2-4702-b890-8033f749bf2b
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
correlation: qa-f2a439a0-bd94-4893-8b8d-c9e27c2b7f37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2a439a0-bd94-4893-8b8d-c9e27c2b7f37
Content-Type: application/json

--- request body ---
{"handle":"qa-4d7ad555cab0","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2a439a0-bd94-4893-8b8d-c9e27c2b7f37
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2a439a0-bd94-4893-8b8d-c9e27c2b7f37"}
```
