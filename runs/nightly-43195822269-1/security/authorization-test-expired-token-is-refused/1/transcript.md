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
| 1 | `POST /v1/accounts` | 201 | 351 | `qa-8b68e6de-f7bd-481a-9992-bf0c3efa4faa` |
| 2 | `POST /v1/auth/token` | 200 | 36 | `qa-523b4c38-11e4-4e52-a3c5-0ab60beca98c` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-1043c7e0-f3c9-491c-896c-27e43af60384` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-e8aa0caa-2385-49a0-97d3-4fce8eca58ec` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-00b00445-cb2b-407a-a28f-8b1d8af2be11` |
| 6 | `GET /v1/accounts/me` | 401 | 8 | `qa-ac291771-5796-4f57-b71f-c753d0c7497a` |
| 7 | `GET /v1/accounts/me` | 401 | 9 | `qa-6412bf57-3905-4cb9-b5ef-b81a58c0928f` |
| 8 | `POST /v1/auth/token` | 200 | 9 | `qa-70bd70c5-815d-4407-afc5-d374c467e3b0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-811166e9-383f-47b0-a623-649ffa275c8e` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-b00f9e39-5207-4c5b-859a-48836489e38b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8b68e6de-f7bd-481a-9992-bf0c3efa4faa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b68e6de-f7bd-481a-9992-bf0c3efa4faa
Content-Type: application/json

--- request body ---
{"handle":"qa-21d2ef174fc1","displayName":"QA 21d2ef174fc1","password":"****","region":"eu"}

--- response: 201 in 351 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b68e6de-f7bd-481a-9992-bf0c3efa4faa
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
Location: /v1/accounts/qa-21d2ef174fc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8d6de39-7b3e-439d-9403-7a099d6fe71f","handle":"qa-21d2ef174fc1","displayName":"QA 21d2ef174fc1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060099035Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-523b4c38-11e4-4e52-a3c5-0ab60beca98c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-523b4c38-11e4-4e52-a3c5-0ab60beca98c
Content-Type: application/json

--- request body ---
{"handle":"qa-21d2ef174fc1","password":"****","ttlSeconds":1}

--- response: 200 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-523b4c38-11e4-4e52-a3c5-0ab60beca98c
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
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_c8d6de39-7b3e-439d-9403-7a099d6fe71f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1043c7e0-f3c9-491c-896c-27e43af60384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1043c7e0-f3c9-491c-896c-27e43af60384
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1043c7e0-f3c9-491c-896c-27e43af60384
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

{"id":"acc_c8d6de39-7b3e-439d-9403-7a099d6fe71f","handle":"qa-21d2ef174fc1","displayName":"QA 21d2ef174fc1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060099035Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8aa0caa-2385-49a0-97d3-4fce8eca58ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8aa0caa-2385-49a0-97d3-4fce8eca58ec
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8aa0caa-2385-49a0-97d3-4fce8eca58ec
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

{"id":"acc_c8d6de39-7b3e-439d-9403-7a099d6fe71f","handle":"qa-21d2ef174fc1","displayName":"QA 21d2ef174fc1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060099035Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-00b00445-cb2b-407a-a28f-8b1d8af2be11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00b00445-cb2b-407a-a28f-8b1d8af2be11
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-00b00445-cb2b-407a-a28f-8b1d8af2be11
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

{"id":"acc_c8d6de39-7b3e-439d-9403-7a099d6fe71f","handle":"qa-21d2ef174fc1","displayName":"QA 21d2ef174fc1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060099035Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac291771-5796-4f57-b71f-c753d0c7497a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac291771-5796-4f57-b71f-c753d0c7497a
Content-Type: application/json

--- response: 401 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac291771-5796-4f57-b71f-c753d0c7497a
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-ac291771-5796-4f57-b71f-c753d0c7497a"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-6412bf57-3905-4cb9-b5ef-b81a58c0928f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6412bf57-3905-4cb9-b5ef-b81a58c0928f
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6412bf57-3905-4cb9-b5ef-b81a58c0928f
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-6412bf57-3905-4cb9-b5ef-b81a58c0928f"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-70bd70c5-815d-4407-afc5-d374c467e3b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70bd70c5-815d-4407-afc5-d374c467e3b0
Content-Type: application/json

--- request body ---
{"handle":"qa-21d2ef174fc1","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-70bd70c5-815d-4407-afc5-d374c467e3b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8d6de39-7b3e-439d-9403-7a099d6fe71f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-811166e9-383f-47b0-a623-649ffa275c8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811166e9-383f-47b0-a623-649ffa275c8e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-811166e9-383f-47b0-a623-649ffa275c8e
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
correlation: qa-b00f9e39-5207-4c5b-859a-48836489e38b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b00f9e39-5207-4c5b-859a-48836489e38b
Content-Type: application/json

--- request body ---
{"handle":"qa-21d2ef174fc1","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b00f9e39-5207-4c5b-859a-48836489e38b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b00f9e39-5207-4c5b-859a-48836489e38b"}
```
