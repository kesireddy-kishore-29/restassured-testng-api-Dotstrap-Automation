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
| 1 | `POST /v1/accounts` | 201 | 317 | `qa-3bb6f576-0c08-4602-a0ec-d7e99a6ed5d3` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-5ba09f9c-b4f7-4273-b6db-865587948f45` |
| 3 | `PATCH /v1/accounts/me` | 200 | 30 | `qa-7e3a9f99-4f35-4ed0-aa7d-1441d93a7ed8` |
| 4 | `GET /v1/accounts/me` | 200 | 20 | `qa-76d4c9d1-5a3c-498f-9fec-30a87f16e166` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b4e20a95-9760-42e9-83a2-64a20923a566` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-220709ba-1022-4662-be6c-fbbdf25deffd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3bb6f576-0c08-4602-a0ec-d7e99a6ed5d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bb6f576-0c08-4602-a0ec-d7e99a6ed5d3
Content-Type: application/json

--- request body ---
{"handle":"qa-d137b30f522c","displayName":"QA d137b30f522c","password":"****","region":"eu"}

--- response: 201 in 317 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bb6f576-0c08-4602-a0ec-d7e99a6ed5d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-d137b30f522c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b009daf-70cd-4719-aace-a9a2266e0462","handle":"qa-d137b30f522c","displayName":"QA d137b30f522c","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.256973086Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5ba09f9c-b4f7-4273-b6db-865587948f45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ba09f9c-b4f7-4273-b6db-865587948f45
Content-Type: application/json

--- request body ---
{"handle":"qa-d137b30f522c","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ba09f9c-b4f7-4273-b6db-865587948f45
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b009daf-70cd-4719-aace-a9a2266e0462"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-7e3a9f99-4f35-4ed0-aa7d-1441d93a7ed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e3a9f99-4f35-4ed0-aa7d-1441d93a7ed8
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 30 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e3a9f99-4f35-4ed0-aa7d-1441d93a7ed8
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

{"id":"acc_8b009daf-70cd-4719-aace-a9a2266e0462","handle":"qa-d137b30f522c","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.256973086Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-76d4c9d1-5a3c-498f-9fec-30a87f16e166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76d4c9d1-5a3c-498f-9fec-30a87f16e166
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-76d4c9d1-5a3c-498f-9fec-30a87f16e166
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

{"id":"acc_8b009daf-70cd-4719-aace-a9a2266e0462","handle":"qa-d137b30f522c","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.256973086Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4e20a95-9760-42e9-83a2-64a20923a566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4e20a95-9760-42e9-83a2-64a20923a566
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4e20a95-9760-42e9-83a2-64a20923a566
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
correlation: qa-220709ba-1022-4662-be6c-fbbdf25deffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-220709ba-1022-4662-be6c-fbbdf25deffd
Content-Type: application/json

--- request body ---
{"handle":"qa-d137b30f522c","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-220709ba-1022-4662-be6c-fbbdf25deffd
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-220709ba-1022-4662-be6c-fbbdf25deffd"}
```
