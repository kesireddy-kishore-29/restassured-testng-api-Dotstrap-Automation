# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-e116d749-6df9-4a0e-a60f-337e7cb7da06` |
| 2 | `POST /v1/auth/token` | 200 | 24 | `qa-cf6e706a-481e-4779-b908-f4eaaf8238b5` |
| 3 | `GET /v1/conversations/{id}` | 404 | 15 | `qa-fe12b08b-5beb-4309-8147-bd389d13383c` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0f0f4ac0-4eba-4cfa-8478-fa57591af382` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-09231089-12a5-453a-81bb-0e66c2f64b7e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e116d749-6df9-4a0e-a60f-337e7cb7da06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e116d749-6df9-4a0e-a60f-337e7cb7da06
Content-Type: application/json

--- request body ---
{"handle":"qa-0f082573b685","displayName":"QA 0f082573b685","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e116d749-6df9-4a0e-a60f-337e7cb7da06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-0f082573b685
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9bad51a0-435d-48e6-8d5c-f45833772f64","handle":"qa-0f082573b685","displayName":"QA 0f082573b685","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.453433549Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cf6e706a-481e-4779-b908-f4eaaf8238b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6e706a-481e-4779-b908-f4eaaf8238b5
Content-Type: application/json

--- request body ---
{"handle":"qa-0f082573b685","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf6e706a-481e-4779-b908-f4eaaf8238b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9bad51a0-435d-48e6-8d5c-f45833772f64"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-fe12b08b-5beb-4309-8147-bd389d13383c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe12b08b-5beb-4309-8147-bd389d13383c
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe12b08b-5beb-4309-8147-bd389d13383c
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-fe12b08b-5beb-4309-8147-bd389d13383c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f0f4ac0-4eba-4cfa-8478-fa57591af382

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f0f4ac0-4eba-4cfa-8478-fa57591af382
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f0f4ac0-4eba-4cfa-8478-fa57591af382
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
correlation: qa-09231089-12a5-453a-81bb-0e66c2f64b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09231089-12a5-453a-81bb-0e66c2f64b7e
Content-Type: application/json

--- request body ---
{"handle":"qa-0f082573b685","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09231089-12a5-453a-81bb-0e66c2f64b7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09231089-12a5-453a-81bb-0e66c2f64b7e"}
```
