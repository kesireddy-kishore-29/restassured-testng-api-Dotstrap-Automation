# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 378 | `qa-32f047ad-a925-4a2c-b4f1-f56168df0dd0` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-8a4796a0-ef16-4411-97cb-9b49bd86a527` |
| 3 | `GET /v1/accounts/me` | 200 | 27 | `qa-f8c8fe17-9ac3-423d-813a-4e376c0b20f5` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-7f83d168-e7e5-4264-9062-5a0d63eebe14` |
| 5 | `GET /v1/accounts/me` | 200 | 20 | `qa-c5be6156-53d5-42a9-9610-b42cad8d9f4e` |
| 6 | `GET /v1/accounts/me` | 401 | 6 | `qa-7f3e7467-aebb-4b45-bb61-b9e84da7b487` |
| 7 | `GET /v1/accounts/me` | 401 | 9 | `qa-977e487d-de13-477d-b109-fbb393963f0b` |
| 8 | `POST /v1/auth/token` | 200 | 17 | `qa-10a63cf8-a4ef-431e-971e-0ab934da7295` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c7db18be-8ef0-46f7-9c25-a85c64f0e9e4` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-2a6881d4-6995-4c56-b380-dd415e0bd33d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32f047ad-a925-4a2c-b4f1-f56168df0dd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32f047ad-a925-4a2c-b4f1-f56168df0dd0
Content-Type: application/json

--- request body ---
{"handle":"qa-431ca237b98b","displayName":"QA 431ca237b98b","password":"****","region":"eu"}

--- response: 201 in 378 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-32f047ad-a925-4a2c-b4f1-f56168df0dd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-431ca237b98b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dfccd30e-2749-45dc-8ad0-08ac4b877ac9","handle":"qa-431ca237b98b","displayName":"QA 431ca237b98b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.847838105Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8a4796a0-ef16-4411-97cb-9b49bd86a527

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a4796a0-ef16-4411-97cb-9b49bd86a527
Content-Type: application/json

--- request body ---
{"handle":"qa-431ca237b98b","password":"****","ttlSeconds":1}

--- response: 200 in 57 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a4796a0-ef16-4411-97cb-9b49bd86a527
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
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_dfccd30e-2749-45dc-8ad0-08ac4b877ac9"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8c8fe17-9ac3-423d-813a-4e376c0b20f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8c8fe17-9ac3-423d-813a-4e376c0b20f5
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8c8fe17-9ac3-423d-813a-4e376c0b20f5
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
Content-Length: 181

{"id":"acc_dfccd30e-2749-45dc-8ad0-08ac4b877ac9","handle":"qa-431ca237b98b","displayName":"QA 431ca237b98b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.847838105Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f83d168-e7e5-4264-9062-5a0d63eebe14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f83d168-e7e5-4264-9062-5a0d63eebe14
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f83d168-e7e5-4264-9062-5a0d63eebe14
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
Content-Length: 181

{"id":"acc_dfccd30e-2749-45dc-8ad0-08ac4b877ac9","handle":"qa-431ca237b98b","displayName":"QA 431ca237b98b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.847838105Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5be6156-53d5-42a9-9610-b42cad8d9f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5be6156-53d5-42a9-9610-b42cad8d9f4e
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5be6156-53d5-42a9-9610-b42cad8d9f4e
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
Content-Length: 181

{"id":"acc_dfccd30e-2749-45dc-8ad0-08ac4b877ac9","handle":"qa-431ca237b98b","displayName":"QA 431ca237b98b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.847838105Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f3e7467-aebb-4b45-bb61-b9e84da7b487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f3e7467-aebb-4b45-bb61-b9e84da7b487
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f3e7467-aebb-4b45-bb61-b9e84da7b487
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
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-7f3e7467-aebb-4b45-bb61-b9e84da7b487"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-977e487d-de13-477d-b109-fbb393963f0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-977e487d-de13-477d-b109-fbb393963f0b
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-977e487d-de13-477d-b109-fbb393963f0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-977e487d-de13-477d-b109-fbb393963f0b"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-10a63cf8-a4ef-431e-971e-0ab934da7295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10a63cf8-a4ef-431e-971e-0ab934da7295
Content-Type: application/json

--- request body ---
{"handle":"qa-431ca237b98b","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-10a63cf8-a4ef-431e-971e-0ab934da7295
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dfccd30e-2749-45dc-8ad0-08ac4b877ac9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7db18be-8ef0-46f7-9c25-a85c64f0e9e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7db18be-8ef0-46f7-9c25-a85c64f0e9e4
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7db18be-8ef0-46f7-9c25-a85c64f0e9e4
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2a6881d4-6995-4c56-b380-dd415e0bd33d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a6881d4-6995-4c56-b380-dd415e0bd33d
Content-Type: application/json

--- request body ---
{"handle":"qa-431ca237b98b","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a6881d4-6995-4c56-b380-dd415e0bd33d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a6881d4-6995-4c56-b380-dd415e0bd33d"}
```
