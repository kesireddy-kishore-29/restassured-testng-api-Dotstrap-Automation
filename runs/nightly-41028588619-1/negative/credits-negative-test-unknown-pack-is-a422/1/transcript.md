# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-5da9c06f-0724-4a3f-a747-5d9e5b3eeaff` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-f44dee45-b215-4bf0-8253-4157fd408b4c` |
| 3 | `POST /v1/credits/purchases` | 422 | 14 | `qa-6d5436c7-2727-4581-b7ac-095784e22c80` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-fd03057e-9094-4b5a-a30b-887db3cab51d` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-b6ae5645-ef6b-424d-b8f2-0622e9bbd799` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5da9c06f-0724-4a3f-a747-5d9e5b3eeaff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da9c06f-0724-4a3f-a747-5d9e5b3eeaff
Content-Type: application/json

--- request body ---
{"handle":"qa-a229827b46f4","displayName":"QA a229827b46f4","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-5da9c06f-0724-4a3f-a747-5d9e5b3eeaff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-a229827b46f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48131479-09d2-45dc-b251-a26daa6da8cd","handle":"qa-a229827b46f4","displayName":"QA a229827b46f4","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.622114901Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f44dee45-b215-4bf0-8253-4157fd408b4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f44dee45-b215-4bf0-8253-4157fd408b4c
Content-Type: application/json

--- request body ---
{"handle":"qa-a229827b46f4","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-f44dee45-b215-4bf0-8253-4157fd408b4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48131479-09d2-45dc-b251-a26daa6da8cd"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6d5436c7-2727-4581-b7ac-095784e22c80

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fc3b581e036947458ee0df99e3f418ac
X-Correlation-Id: qa-6d5436c7-2727-4581-b7ac-095784e22c80
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 14 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d5436c7-2727-4581-b7ac-095784e22c80
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-6d5436c7-2727-4581-b7ac-095784e22c80","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd03057e-9094-4b5a-a30b-887db3cab51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd03057e-9094-4b5a-a30b-887db3cab51d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd03057e-9094-4b5a-a30b-887db3cab51d
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
correlation: qa-b6ae5645-ef6b-424d-b8f2-0622e9bbd799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6ae5645-ef6b-424d-b8f2-0622e9bbd799
Content-Type: application/json

--- request body ---
{"handle":"qa-a229827b46f4","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6ae5645-ef6b-424d-b8f2-0622e9bbd799
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6ae5645-ef6b-424d-b8f2-0622e9bbd799"}
```
