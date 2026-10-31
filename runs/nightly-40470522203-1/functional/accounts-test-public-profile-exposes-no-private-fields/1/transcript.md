# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-0a302ecf-92ec-4907-8527-e40df4d85c44` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-7d3918e8-3748-4206-9063-0ce6bf15dc28` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-f674f192-5066-49ec-933e-1e9584f100a2` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 21 | `qa-675aa82d-9d39-4a09-97f4-8336bf2d3f2c` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-e1311c85-20b4-43ae-b183-659bd65f3cb9` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 8 | `qa-87044712-39a3-435f-8de0-ef3d4afe95d9` |
| 7 | `POST /v1/auth/token` | 200 | 13 | `qa-467b28b5-192e-4963-a463-a900e016f827` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ab150a10-d217-443d-8807-a05459cac344` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-c48e8a3c-1b78-4cf5-a8c2-53271d2c689e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b5f5f539-d433-441e-bd55-eca9dd76b924` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-db503b71-783e-45a5-ab96-3536c90c14b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0a302ecf-92ec-4907-8527-e40df4d85c44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a302ecf-92ec-4907-8527-e40df4d85c44
Content-Type: application/json

--- request body ---
{"handle":"qa-683dea95fb98","displayName":"QA 683dea95fb98","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a302ecf-92ec-4907-8527-e40df4d85c44
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
Location: /v1/accounts/qa-683dea95fb98
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1d049bd-bc5f-47fe-8c0a-e19d033c1c7d","handle":"qa-683dea95fb98","displayName":"QA 683dea95fb98","region":"eu","role":"user","createdAt":"2026-10-27T08:00:30.975176478Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7d3918e8-3748-4206-9063-0ce6bf15dc28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d3918e8-3748-4206-9063-0ce6bf15dc28
Content-Type: application/json

--- request body ---
{"handle":"qa-d6ab41aaae6b","displayName":"QA d6ab41aaae6b","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d3918e8-3748-4206-9063-0ce6bf15dc28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-d6ab41aaae6b
X-Served-Region: us
Content-Length: 181

{"id":"acc_8a428370-e70f-474c-aff3-44a889d9182f","handle":"qa-d6ab41aaae6b","displayName":"QA d6ab41aaae6b","region":"us","role":"user","createdAt":"2026-10-27T08:00:31.007516063Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f674f192-5066-49ec-933e-1e9584f100a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f674f192-5066-49ec-933e-1e9584f100a2
Content-Type: application/json

--- request body ---
{"handle":"qa-683dea95fb98","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f674f192-5066-49ec-933e-1e9584f100a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1d049bd-bc5f-47fe-8c0a-e19d033c1c7d"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-d6ab41aaae6b
correlation: qa-675aa82d-9d39-4a09-97f4-8336bf2d3f2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-675aa82d-9d39-4a09-97f4-8336bf2d3f2c
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-675aa82d-9d39-4a09-97f4-8336bf2d3f2c
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
Content-Length: 74

{"handle":"qa-d6ab41aaae6b","displayName":"QA d6ab41aaae6b","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-d6ab41aaae6b
correlation: qa-e1311c85-20b4-43ae-b183-659bd65f3cb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1311c85-20b4-43ae-b183-659bd65f3cb9
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1311c85-20b4-43ae-b183-659bd65f3cb9
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
Content-Length: 74

{"handle":"qa-d6ab41aaae6b","displayName":"QA d6ab41aaae6b","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-d6ab41aaae6b
correlation: qa-87044712-39a3-435f-8de0-ef3d4afe95d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87044712-39a3-435f-8de0-ef3d4afe95d9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-87044712-39a3-435f-8de0-ef3d4afe95d9
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
Content-Length: 74

{"handle":"qa-d6ab41aaae6b","displayName":"QA d6ab41aaae6b","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-467b28b5-192e-4963-a463-a900e016f827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-467b28b5-192e-4963-a463-a900e016f827
Content-Type: application/json

--- request body ---
{"handle":"qa-d6ab41aaae6b","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-467b28b5-192e-4963-a463-a900e016f827
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a428370-e70f-474c-aff3-44a889d9182f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab150a10-d217-443d-8807-a05459cac344

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab150a10-d217-443d-8807-a05459cac344
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab150a10-d217-443d-8807-a05459cac344
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-c48e8a3c-1b78-4cf5-a8c2-53271d2c689e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c48e8a3c-1b78-4cf5-a8c2-53271d2c689e
Content-Type: application/json

--- request body ---
{"handle":"qa-d6ab41aaae6b","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c48e8a3c-1b78-4cf5-a8c2-53271d2c689e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c48e8a3c-1b78-4cf5-a8c2-53271d2c689e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5f5f539-d433-441e-bd55-eca9dd76b924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5f5f539-d433-441e-bd55-eca9dd76b924
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5f5f539-d433-441e-bd55-eca9dd76b924
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
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-db503b71-783e-45a5-ab96-3536c90c14b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db503b71-783e-45a5-ab96-3536c90c14b3
Content-Type: application/json

--- request body ---
{"handle":"qa-683dea95fb98","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db503b71-783e-45a5-ab96-3536c90c14b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db503b71-783e-45a5-ab96-3536c90c14b3"}
```
