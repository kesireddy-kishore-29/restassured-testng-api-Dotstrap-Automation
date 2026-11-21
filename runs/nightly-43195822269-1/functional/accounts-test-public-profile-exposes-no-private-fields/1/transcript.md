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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-b72c3f71-5214-4674-af09-b012956f1764` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-9857790d-3840-4061-8524-f5371bf6e83d` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-be0d2e6c-1296-4a70-a141-0e2ae115e00e` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-c57b0eca-ef37-4ecd-b02c-85a86dfae16a` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-69ef1e58-5c7a-4210-ad99-f5f6671e424f` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-177e9c53-3c8d-45ac-919f-64eab6621e0d` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-5d4e30a3-69df-4c66-b33f-6245142e516f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e480b75e-0cab-4092-a590-b819aca34efa` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-f3caf20b-3d6a-422b-bb42-3c72700ed0b3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f3276576-d572-432a-ad58-e9c8a175fe27` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-a0ea6124-5c7d-469b-9af8-2c161fe7ab95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b72c3f71-5214-4674-af09-b012956f1764

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b72c3f71-5214-4674-af09-b012956f1764
Content-Type: application/json

--- request body ---
{"handle":"qa-3e7b896d937c","displayName":"QA 3e7b896d937c","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b72c3f71-5214-4674-af09-b012956f1764
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-3e7b896d937c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d327fbc-38ab-4c49-aecf-7504d83f0bdf","handle":"qa-3e7b896d937c","displayName":"QA 3e7b896d937c","region":"eu","role":"user","createdAt":"2026-11-12T09:56:36.344655454Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9857790d-3840-4061-8524-f5371bf6e83d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9857790d-3840-4061-8524-f5371bf6e83d
Content-Type: application/json

--- request body ---
{"handle":"qa-0eecabc51634","displayName":"QA 0eecabc51634","password":"****","region":"us"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9857790d-3840-4061-8524-f5371bf6e83d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-0eecabc51634
X-Served-Region: us
Content-Length: 181

{"id":"acc_5ea3d717-f3fb-4977-9e64-eb9fe2c61fdc","handle":"qa-0eecabc51634","displayName":"QA 0eecabc51634","region":"us","role":"user","createdAt":"2026-11-12T09:56:36.376040196Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-be0d2e6c-1296-4a70-a141-0e2ae115e00e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be0d2e6c-1296-4a70-a141-0e2ae115e00e
Content-Type: application/json

--- request body ---
{"handle":"qa-3e7b896d937c","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-be0d2e6c-1296-4a70-a141-0e2ae115e00e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d327fbc-38ab-4c49-aecf-7504d83f0bdf"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-0eecabc51634
correlation: qa-c57b0eca-ef37-4ecd-b02c-85a86dfae16a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c57b0eca-ef37-4ecd-b02c-85a86dfae16a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c57b0eca-ef37-4ecd-b02c-85a86dfae16a
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

{"handle":"qa-0eecabc51634","displayName":"QA 0eecabc51634","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-0eecabc51634
correlation: qa-69ef1e58-5c7a-4210-ad99-f5f6671e424f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69ef1e58-5c7a-4210-ad99-f5f6671e424f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-69ef1e58-5c7a-4210-ad99-f5f6671e424f
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

{"handle":"qa-0eecabc51634","displayName":"QA 0eecabc51634","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-0eecabc51634
correlation: qa-177e9c53-3c8d-45ac-919f-64eab6621e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-177e9c53-3c8d-45ac-919f-64eab6621e0d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-177e9c53-3c8d-45ac-919f-64eab6621e0d
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

{"handle":"qa-0eecabc51634","displayName":"QA 0eecabc51634","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-5d4e30a3-69df-4c66-b33f-6245142e516f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d4e30a3-69df-4c66-b33f-6245142e516f
Content-Type: application/json

--- request body ---
{"handle":"qa-0eecabc51634","password":"****"}

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d4e30a3-69df-4c66-b33f-6245142e516f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ea3d717-f3fb-4977-9e64-eb9fe2c61fdc"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e480b75e-0cab-4092-a590-b819aca34efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e480b75e-0cab-4092-a590-b819aca34efa
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e480b75e-0cab-4092-a590-b819aca34efa
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
correlation: qa-f3caf20b-3d6a-422b-bb42-3c72700ed0b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3caf20b-3d6a-422b-bb42-3c72700ed0b3
Content-Type: application/json

--- request body ---
{"handle":"qa-0eecabc51634","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3caf20b-3d6a-422b-bb42-3c72700ed0b3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3caf20b-3d6a-422b-bb42-3c72700ed0b3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3276576-d572-432a-ad58-e9c8a175fe27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3276576-d572-432a-ad58-e9c8a175fe27
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3276576-d572-432a-ad58-e9c8a175fe27
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
correlation: qa-a0ea6124-5c7d-469b-9af8-2c161fe7ab95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0ea6124-5c7d-469b-9af8-2c161fe7ab95
Content-Type: application/json

--- request body ---
{"handle":"qa-3e7b896d937c","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0ea6124-5c7d-469b-9af8-2c161fe7ab95
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0ea6124-5c7d-469b-9af8-2c161fe7ab95"}
```
