# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-350cdedf-830c-4f83-b29d-de6f5166301e` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-6b778d65-2570-4656-bb43-063e8f726f77` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 11 | `qa-16262659-10e0-4f5f-aa84-ba80abc33366` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0989f202-e058-453a-9038-bd243520acf6` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-e4c59b07-d582-4298-89ef-5a0fa5da9433` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-350cdedf-830c-4f83-b29d-de6f5166301e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-350cdedf-830c-4f83-b29d-de6f5166301e
Content-Type: application/json

--- request body ---
{"handle":"qa-21ec7c78c409","displayName":"QA 21ec7c78c409","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-350cdedf-830c-4f83-b29d-de6f5166301e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Location: /v1/accounts/qa-21ec7c78c409
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41ae31e7-c872-4531-aa6d-19ddd61815fc","handle":"qa-21ec7c78c409","displayName":"QA 21ec7c78c409","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.131924090Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6b778d65-2570-4656-bb43-063e8f726f77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b778d65-2570-4656-bb43-063e8f726f77
Content-Type: application/json

--- request body ---
{"handle":"qa-21ec7c78c409","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b778d65-2570-4656-bb43-063e8f726f77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41ae31e7-c872-4531-aa6d-19ddd61815fc"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-16262659-10e0-4f5f-aa84-ba80abc33366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16262659-10e0-4f5f-aa84-ba80abc33366
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16262659-10e0-4f5f-aa84-ba80abc33366
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-16262659-10e0-4f5f-aa84-ba80abc33366"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0989f202-e058-453a-9038-bd243520acf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0989f202-e058-453a-9038-bd243520acf6
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0989f202-e058-453a-9038-bd243520acf6
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
correlation: qa-e4c59b07-d582-4298-89ef-5a0fa5da9433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c59b07-d582-4298-89ef-5a0fa5da9433
Content-Type: application/json

--- request body ---
{"handle":"qa-21ec7c78c409","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4c59b07-d582-4298-89ef-5a0fa5da9433
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4c59b07-d582-4298-89ef-5a0fa5da9433"}
```
