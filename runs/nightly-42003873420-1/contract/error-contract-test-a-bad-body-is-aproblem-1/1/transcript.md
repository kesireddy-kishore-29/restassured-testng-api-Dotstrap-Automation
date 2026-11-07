# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 57 | `qa-3abf599c-57bf-48c4-9275-c8f2247ca6db` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-aba109cd-1a0f-4ac2-a493-747d9c44fd0e` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-bd1f14ea-e5ca-4180-b4ba-423d1f92726c` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-aa60b00f-b45b-4fcc-8de1-5a7fe4603f9b` |
| 5 | `POST /v1/auth/token` | 415 | 33 | `qa-e299d832-2a67-4bb9-816a-b101a281965e` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-1f405066-23c8-4b5c-bf51-f979d21a0dbd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-2a8879fc-f2f8-47e5-9352-84255b3694fe` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-e7c8b0a8-00dc-4b13-bf46-dd53a5b785b3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-d06813b0-fee2-4848-b074-9ee190c0cf6c` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-3f7c6959-257c-4212-b74a-4eaa9b561109` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3abf599c-57bf-48c4-9275-c8f2247ca6db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3abf599c-57bf-48c4-9275-c8f2247ca6db
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f3845bd477","displayName":"QA a9f3845bd477","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3abf599c-57bf-48c4-9275-c8f2247ca6db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-a9f3845bd477
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1b76eb4-e845-4445-bca5-44c509a79230","handle":"qa-a9f3845bd477","displayName":"QA a9f3845bd477","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.858993603Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aba109cd-1a0f-4ac2-a493-747d9c44fd0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aba109cd-1a0f-4ac2-a493-747d9c44fd0e
Content-Type: application/json

--- request body ---
{"handle":"qa-181466488977","displayName":"QA 181466488977","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-aba109cd-1a0f-4ac2-a493-747d9c44fd0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-181466488977
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c65aa1fa-85af-4f2e-a021-0834253b5817","handle":"qa-181466488977","displayName":"QA 181466488977","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.898807026Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bd1f14ea-e5ca-4180-b4ba-423d1f92726c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd1f14ea-e5ca-4180-b4ba-423d1f92726c
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f3845bd477","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd1f14ea-e5ca-4180-b4ba-423d1f92726c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1b76eb4-e845-4445-bca5-44c509a79230"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-aa60b00f-b45b-4fcc-8de1-5a7fe4603f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa60b00f-b45b-4fcc-8de1-5a7fe4603f9b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-181466488977","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa60b00f-b45b-4fcc-8de1-5a7fe4603f9b
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
Location: /v1/conversations/cnv_ae5ec0d5-d5bf-45ed-a04f-c2fbcd797f90
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae5ec0d5-d5bf-45ed-a04f-c2fbcd797f90","subject":"Error contract","status":"open","region":"eu","participants":["qa-a9f3845bd477","qa-181466488977"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.993770539Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e299d832-2a67-4bb9-816a-b101a281965e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e299d832-2a67-4bb9-816a-b101a281965e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 33 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e299d832-2a67-4bb9-816a-b101a281965e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-e299d832-2a67-4bb9-816a-b101a281965e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1f405066-23c8-4b5c-bf51-f979d21a0dbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f405066-23c8-4b5c-bf51-f979d21a0dbd
Content-Type: application/json

--- request body ---
{"handle":"qa-181466488977","password":"****"}

--- response: 200 in 52 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f405066-23c8-4b5c-bf51-f979d21a0dbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c65aa1fa-85af-4f2e-a021-0834253b5817"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a8879fc-f2f8-47e5-9352-84255b3694fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a8879fc-f2f8-47e5-9352-84255b3694fe
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a8879fc-f2f8-47e5-9352-84255b3694fe
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e7c8b0a8-00dc-4b13-bf46-dd53a5b785b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7c8b0a8-00dc-4b13-bf46-dd53a5b785b3
Content-Type: application/json

--- request body ---
{"handle":"qa-181466488977","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7c8b0a8-00dc-4b13-bf46-dd53a5b785b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7c8b0a8-00dc-4b13-bf46-dd53a5b785b3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d06813b0-fee2-4848-b074-9ee190c0cf6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d06813b0-fee2-4848-b074-9ee190c0cf6c
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d06813b0-fee2-4848-b074-9ee190c0cf6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3f7c6959-257c-4212-b74a-4eaa9b561109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f7c6959-257c-4212-b74a-4eaa9b561109
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f3845bd477","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f7c6959-257c-4212-b74a-4eaa9b561109
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f7c6959-257c-4212-b74a-4eaa9b561109"}
```
