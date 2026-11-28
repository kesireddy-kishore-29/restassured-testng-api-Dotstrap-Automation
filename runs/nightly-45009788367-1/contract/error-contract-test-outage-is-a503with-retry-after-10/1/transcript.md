# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-5f05e596-dec1-4aef-9cbe-296e497675e6` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-70a8e529-f38c-46b1-bdff-d4e4f1840f0d` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-55cc1cb7-0397-44f3-aafc-2d133c8a4e66` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-96a52f53-959b-436c-8b2d-acba55a4a887` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 11 | `qa-a42993fc-b09a-4411-b3dd-75ae7362271e` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-ebe7f14d-9114-4bf3-9c56-e7e7f819b96c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8e463713-ea9f-41b8-a22f-65a0f16ecdef` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-ad2ead05-b214-4a5a-b42e-30d9c194cc3c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-82dc3dca-bd3e-4d41-b8b9-6303519ab54d` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-ac548ed1-ee4f-43e8-a946-90e98dc1391d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5f05e596-dec1-4aef-9cbe-296e497675e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f05e596-dec1-4aef-9cbe-296e497675e6
Content-Type: application/json

--- request body ---
{"handle":"qa-295abe1881e8","displayName":"QA 295abe1881e8","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f05e596-dec1-4aef-9cbe-296e497675e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-295abe1881e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56edb466-47f4-4e86-8a22-caf2e131be0f","handle":"qa-295abe1881e8","displayName":"QA 295abe1881e8","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.731514452Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-70a8e529-f38c-46b1-bdff-d4e4f1840f0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a8e529-f38c-46b1-bdff-d4e4f1840f0d
Content-Type: application/json

--- request body ---
{"handle":"qa-a4db06c4653d","displayName":"QA a4db06c4653d","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-70a8e529-f38c-46b1-bdff-d4e4f1840f0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-a4db06c4653d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_32a59017-bd33-458a-be39-a72d0a4e5fd4","handle":"qa-a4db06c4653d","displayName":"QA a4db06c4653d","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.770457919Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-55cc1cb7-0397-44f3-aafc-2d133c8a4e66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55cc1cb7-0397-44f3-aafc-2d133c8a4e66
Content-Type: application/json

--- request body ---
{"handle":"qa-295abe1881e8","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-55cc1cb7-0397-44f3-aafc-2d133c8a4e66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56edb466-47f4-4e86-8a22-caf2e131be0f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-96a52f53-959b-436c-8b2d-acba55a4a887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96a52f53-959b-436c-8b2d-acba55a4a887
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a4db06c4653d","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-96a52f53-959b-436c-8b2d-acba55a4a887
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
Location: /v1/conversations/cnv_c05da554-0cee-4bb4-a584-8ee4c01633f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c05da554-0cee-4bb4-a584-8ee4c01633f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-295abe1881e8","qa-a4db06c4653d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.823162141Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c05da554-0cee-4bb4-a584-8ee4c01633f0/messages
correlation: qa-a42993fc-b09a-4411-b3dd-75ae7362271e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 40c890e0-0a97-4de8-a53b-1f08601a8e27
X-Correlation-Id: qa-a42993fc-b09a-4411-b3dd-75ae7362271e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a42993fc-b09a-4411-b3dd-75ae7362271e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_c05da554-0cee-4bb4-a584-8ee4c01633f0/messages","correlationId":"qa-a42993fc-b09a-4411-b3dd-75ae7362271e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ebe7f14d-9114-4bf3-9c56-e7e7f819b96c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe7f14d-9114-4bf3-9c56-e7e7f819b96c
Content-Type: application/json

--- request body ---
{"handle":"qa-a4db06c4653d","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe7f14d-9114-4bf3-9c56-e7e7f819b96c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_32a59017-bd33-458a-be39-a72d0a4e5fd4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e463713-ea9f-41b8-a22f-65a0f16ecdef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e463713-ea9f-41b8-a22f-65a0f16ecdef
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e463713-ea9f-41b8-a22f-65a0f16ecdef
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
correlation: qa-ad2ead05-b214-4a5a-b42e-30d9c194cc3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad2ead05-b214-4a5a-b42e-30d9c194cc3c
Content-Type: application/json

--- request body ---
{"handle":"qa-a4db06c4653d","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad2ead05-b214-4a5a-b42e-30d9c194cc3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad2ead05-b214-4a5a-b42e-30d9c194cc3c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82dc3dca-bd3e-4d41-b8b9-6303519ab54d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82dc3dca-bd3e-4d41-b8b9-6303519ab54d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82dc3dca-bd3e-4d41-b8b9-6303519ab54d
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ac548ed1-ee4f-43e8-a946-90e98dc1391d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac548ed1-ee4f-43e8-a946-90e98dc1391d
Content-Type: application/json

--- request body ---
{"handle":"qa-295abe1881e8","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac548ed1-ee4f-43e8-a946-90e98dc1391d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac548ed1-ee4f-43e8-a946-90e98dc1391d"}
```
