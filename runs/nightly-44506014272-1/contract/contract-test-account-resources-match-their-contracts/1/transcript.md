# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 276 | `qa-d0838e18-3c9d-4af2-b48e-291fb081a08c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-a5c8a076-5404-449f-b88c-1aa30d86dc47` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-5d29a5f9-ac9a-4bcb-b4f1-82e52cc86c04` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-8fbd4991-7dc8-4941-83ee-dfc2ef02d9f9` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-a0c58d54-e2eb-4c83-b707-61c8527d1c57` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 28 | `qa-47724a82-42f0-4de5-bfcc-928b8445f0fa` |
| 7 | `POST /v1/auth/token` | 200 | 18 | `qa-e720439b-6e5d-4c7e-87f7-a0b17d00300c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0c046446-4640-4316-93cd-cf9210dbbd9e` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-e9cda3d1-e1e1-4809-919f-faecfd5e8578` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c2ca4ffc-b434-4a0c-b2f0-bd1753497ae3` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-589f3adf-975a-429c-88c6-45fcd502376f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0838e18-3c9d-4af2-b48e-291fb081a08c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0838e18-3c9d-4af2-b48e-291fb081a08c
Content-Type: application/json

--- request body ---
{"handle":"qa-570604dac57b","displayName":"QA 570604dac57b","password":"****","region":"eu"}

--- response: 201 in 276 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0838e18-3c9d-4af2-b48e-291fb081a08c
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
Location: /v1/accounts/qa-570604dac57b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_357d9ade-5b50-4df3-b27f-6d30b85df9c4","handle":"qa-570604dac57b","displayName":"QA 570604dac57b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:18.137774325Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a5c8a076-5404-449f-b88c-1aa30d86dc47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c8a076-5404-449f-b88c-1aa30d86dc47
Content-Type: application/json

--- request body ---
{"handle":"qa-c20c2f16a144","displayName":"QA c20c2f16a144","password":"****","region":"us"}

--- response: 201 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5c8a076-5404-449f-b88c-1aa30d86dc47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-c20c2f16a144
X-Served-Region: us
Content-Length: 181

{"id":"acc_d43e6984-bc48-4f2b-9a5d-8efc1b25376d","handle":"qa-c20c2f16a144","displayName":"QA c20c2f16a144","region":"us","role":"user","createdAt":"2026-11-19T10:29:18.409031301Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5d29a5f9-ac9a-4bcb-b4f1-82e52cc86c04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d29a5f9-ac9a-4bcb-b4f1-82e52cc86c04
Content-Type: application/json

--- request body ---
{"handle":"qa-570604dac57b","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d29a5f9-ac9a-4bcb-b4f1-82e52cc86c04
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_357d9ade-5b50-4df3-b27f-6d30b85df9c4"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8fbd4991-7dc8-4941-83ee-dfc2ef02d9f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fbd4991-7dc8-4941-83ee-dfc2ef02d9f9
Content-Type: application/json

--- request body ---
{"handle":"qa-570604dac57b","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fbd4991-7dc8-4941-83ee-dfc2ef02d9f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_357d9ade-5b50-4df3-b27f-6d30b85df9c4"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0c58d54-e2eb-4c83-b707-61c8527d1c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c58d54-e2eb-4c83-b707-61c8527d1c57
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0c58d54-e2eb-4c83-b707-61c8527d1c57
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

{"id":"acc_357d9ade-5b50-4df3-b27f-6d30b85df9c4","handle":"qa-570604dac57b","displayName":"QA 570604dac57b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:18.137774325Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-c20c2f16a144
correlation: qa-47724a82-42f0-4de5-bfcc-928b8445f0fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47724a82-42f0-4de5-bfcc-928b8445f0fa
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-47724a82-42f0-4de5-bfcc-928b8445f0fa
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

{"handle":"qa-c20c2f16a144","displayName":"QA c20c2f16a144","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e720439b-6e5d-4c7e-87f7-a0b17d00300c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e720439b-6e5d-4c7e-87f7-a0b17d00300c
Content-Type: application/json

--- request body ---
{"handle":"qa-c20c2f16a144","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-e720439b-6e5d-4c7e-87f7-a0b17d00300c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d43e6984-bc48-4f2b-9a5d-8efc1b25376d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c046446-4640-4316-93cd-cf9210dbbd9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c046446-4640-4316-93cd-cf9210dbbd9e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c046446-4640-4316-93cd-cf9210dbbd9e
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
correlation: qa-e9cda3d1-e1e1-4809-919f-faecfd5e8578

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9cda3d1-e1e1-4809-919f-faecfd5e8578
Content-Type: application/json

--- request body ---
{"handle":"qa-c20c2f16a144","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9cda3d1-e1e1-4809-919f-faecfd5e8578
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9cda3d1-e1e1-4809-919f-faecfd5e8578"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2ca4ffc-b434-4a0c-b2f0-bd1753497ae3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ca4ffc-b434-4a0c-b2f0-bd1753497ae3
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2ca4ffc-b434-4a0c-b2f0-bd1753497ae3
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-589f3adf-975a-429c-88c6-45fcd502376f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-589f3adf-975a-429c-88c6-45fcd502376f
Content-Type: application/json

--- request body ---
{"handle":"qa-570604dac57b","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-589f3adf-975a-429c-88c6-45fcd502376f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-589f3adf-975a-429c-88c6-45fcd502376f"}
```
