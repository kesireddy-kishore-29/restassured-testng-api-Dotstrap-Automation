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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-396b8213-f9e9-4704-90f3-f7425e3c506e` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-18e4de21-14c5-4b51-b8aa-86ee307ed7cd` |
| 3 | `GET /v1/accounts/me` | 200 | 9 | `qa-d5e870de-af12-43f9-a471-eaf7775aedf7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a9534d26-8598-42bf-925f-4b1a7ffa98eb` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-bf0d6ec0-cfc5-414b-9005-531431b1f820` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-396b8213-f9e9-4704-90f3-f7425e3c506e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-396b8213-f9e9-4704-90f3-f7425e3c506e
Content-Type: application/json

--- request body ---
{"handle":"qa-ffb13aaadb49","displayName":"QA ffb13aaadb49","password":"****","region":"in"}

--- response: 201 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-396b8213-f9e9-4704-90f3-f7425e3c506e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-ffb13aaadb49
X-Served-Region: in
Content-Length: 181

{"id":"acc_0a189b78-960f-4172-b56a-ab1d44b23202","handle":"qa-ffb13aaadb49","displayName":"QA ffb13aaadb49","region":"in","role":"user","createdAt":"2026-10-24T07:25:03.142430189Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-18e4de21-14c5-4b51-b8aa-86ee307ed7cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e4de21-14c5-4b51-b8aa-86ee307ed7cd
Content-Type: application/json

--- request body ---
{"handle":"qa-ffb13aaadb49","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-18e4de21-14c5-4b51-b8aa-86ee307ed7cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a189b78-960f-4172-b56a-ab1d44b23202"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5e870de-af12-43f9-a471-eaf7775aedf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5e870de-af12-43f9-a471-eaf7775aedf7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5e870de-af12-43f9-a471-eaf7775aedf7
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

{"id":"acc_0a189b78-960f-4172-b56a-ab1d44b23202","handle":"qa-ffb13aaadb49","displayName":"QA ffb13aaadb49","region":"in","role":"user","createdAt":"2026-10-24T07:25:03.142430189Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9534d26-8598-42bf-925f-4b1a7ffa98eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9534d26-8598-42bf-925f-4b1a7ffa98eb
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9534d26-8598-42bf-925f-4b1a7ffa98eb
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
correlation: qa-bf0d6ec0-cfc5-414b-9005-531431b1f820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0d6ec0-cfc5-414b-9005-531431b1f820
Content-Type: application/json

--- request body ---
{"handle":"qa-ffb13aaadb49","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf0d6ec0-cfc5-414b-9005-531431b1f820
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf0d6ec0-cfc5-414b-9005-531431b1f820"}
```
