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
| 1 | `POST /v1/accounts` | 201 | 389 | `qa-da4fe305-2e06-4602-8a7c-02889915279a` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-2f502efa-edef-41db-af66-73e18a0d0677` |
| 3 | `PATCH /v1/accounts/me` | 200 | 59 | `qa-6304e19f-ead2-4931-a315-950d760e27f5` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-025beee0-97a7-470a-aaa2-8c05abeb7b3e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-2b103258-8828-481e-9e7e-939acbe67dc8` |
| 6 | `POST /v1/auth/token` | 401 | 34 | `qa-64d7dcfc-d0b0-4230-9c4d-3f1c9ff82b79` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da4fe305-2e06-4602-8a7c-02889915279a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da4fe305-2e06-4602-8a7c-02889915279a
Content-Type: application/json

--- request body ---
{"handle":"qa-0ed026ddebdb","displayName":"QA 0ed026ddebdb","password":"****","region":"eu"}

--- response: 201 in 389 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-da4fe305-2e06-4602-8a7c-02889915279a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-0ed026ddebdb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc4cd545-6832-47ab-9679-e28c19ef2c8b","handle":"qa-0ed026ddebdb","displayName":"QA 0ed026ddebdb","region":"eu","role":"user","createdAt":"2026-11-26T11:02:33.415412193Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2f502efa-edef-41db-af66-73e18a0d0677

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f502efa-edef-41db-af66-73e18a0d0677
Content-Type: application/json

--- request body ---
{"handle":"qa-0ed026ddebdb","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f502efa-edef-41db-af66-73e18a0d0677
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc4cd545-6832-47ab-9679-e28c19ef2c8b"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6304e19f-ead2-4931-a315-950d760e27f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6304e19f-ead2-4931-a315-950d760e27f5
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 59 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6304e19f-ead2-4931-a315-950d760e27f5
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

{"id":"acc_cc4cd545-6832-47ab-9679-e28c19ef2c8b","handle":"qa-0ed026ddebdb","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-26T11:02:33.415412193Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-025beee0-97a7-470a-aaa2-8c05abeb7b3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025beee0-97a7-470a-aaa2-8c05abeb7b3e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-025beee0-97a7-470a-aaa2-8c05abeb7b3e
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

{"id":"acc_cc4cd545-6832-47ab-9679-e28c19ef2c8b","handle":"qa-0ed026ddebdb","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-26T11:02:33.415412193Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b103258-8828-481e-9e7e-939acbe67dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b103258-8828-481e-9e7e-939acbe67dc8
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b103258-8828-481e-9e7e-939acbe67dc8
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
correlation: qa-64d7dcfc-d0b0-4230-9c4d-3f1c9ff82b79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64d7dcfc-d0b0-4230-9c4d-3f1c9ff82b79
Content-Type: application/json

--- request body ---
{"handle":"qa-0ed026ddebdb","password":"****"}

--- response: 401 in 34 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64d7dcfc-d0b0-4230-9c4d-3f1c9ff82b79
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64d7dcfc-d0b0-4230-9c4d-3f1c9ff82b79"}
```
