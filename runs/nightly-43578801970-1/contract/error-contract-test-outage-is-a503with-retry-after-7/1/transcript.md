# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-5a0ee45d-4e7e-474c-b229-ecd6aebfe729` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-f78bd13c-4b48-43ae-974b-78a5d6d3e673` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-8606e8bc-9140-435e-89f4-e907cd72ab31` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-18e57355-c1e6-4890-bde2-8d313d14094a` |
| 5 | `GET /v1/conversations` | 503 | 17 | `qa-3591afcc-98c6-4a6b-9254-a864ec64cad0` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-2210a351-d924-43fb-918c-2a4b3a9e589c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-53820d63-8299-45f2-ab39-5faa06bf3b27` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-e27b28e4-9f54-46cc-9ed5-4b3ade6d368f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-72877738-574c-4a7a-8297-9c376cec239f` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-c192ef99-fcc5-4058-965c-5e333534a295` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5a0ee45d-4e7e-474c-b229-ecd6aebfe729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a0ee45d-4e7e-474c-b229-ecd6aebfe729
Content-Type: application/json

--- request body ---
{"handle":"qa-8745436ee4f6","displayName":"QA 8745436ee4f6","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a0ee45d-4e7e-474c-b229-ecd6aebfe729
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-8745436ee4f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b7cd711-400f-4c39-9d63-57a94a254def","handle":"qa-8745436ee4f6","displayName":"QA 8745436ee4f6","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.434187523Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f78bd13c-4b48-43ae-974b-78a5d6d3e673

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f78bd13c-4b48-43ae-974b-78a5d6d3e673
Content-Type: application/json

--- request body ---
{"handle":"qa-38a17461d79e","displayName":"QA 38a17461d79e","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f78bd13c-4b48-43ae-974b-78a5d6d3e673
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Location: /v1/accounts/qa-38a17461d79e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_886b9142-6d71-44a3-9b25-6b60101ea42f","handle":"qa-38a17461d79e","displayName":"QA 38a17461d79e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.519754699Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8606e8bc-9140-435e-89f4-e907cd72ab31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8606e8bc-9140-435e-89f4-e907cd72ab31
Content-Type: application/json

--- request body ---
{"handle":"qa-8745436ee4f6","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8606e8bc-9140-435e-89f4-e907cd72ab31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b7cd711-400f-4c39-9d63-57a94a254def"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-18e57355-c1e6-4890-bde2-8d313d14094a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e57355-c1e6-4890-bde2-8d313d14094a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38a17461d79e","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-18e57355-c1e6-4890-bde2-8d313d14094a
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
Location: /v1/conversations/cnv_ec1e8599-0051-4ac5-92d5-00f9c73f332e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ec1e8599-0051-4ac5-92d5-00f9c73f332e","subject":"Error contract","status":"open","region":"eu","participants":["qa-8745436ee4f6","qa-38a17461d79e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.600648320Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-3591afcc-98c6-4a6b-9254-a864ec64cad0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 30959abf-0a44-44c9-885c-723fab5574ac
X-Correlation-Id: qa-3591afcc-98c6-4a6b-9254-a864ec64cad0
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3591afcc-98c6-4a6b-9254-a864ec64cad0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-3591afcc-98c6-4a6b-9254-a864ec64cad0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2210a351-d924-43fb-918c-2a4b3a9e589c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2210a351-d924-43fb-918c-2a4b3a9e589c
Content-Type: application/json

--- request body ---
{"handle":"qa-38a17461d79e","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2210a351-d924-43fb-918c-2a4b3a9e589c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_886b9142-6d71-44a3-9b25-6b60101ea42f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53820d63-8299-45f2-ab39-5faa06bf3b27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53820d63-8299-45f2-ab39-5faa06bf3b27
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53820d63-8299-45f2-ab39-5faa06bf3b27
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
correlation: qa-e27b28e4-9f54-46cc-9ed5-4b3ade6d368f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e27b28e4-9f54-46cc-9ed5-4b3ade6d368f
Content-Type: application/json

--- request body ---
{"handle":"qa-38a17461d79e","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e27b28e4-9f54-46cc-9ed5-4b3ade6d368f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e27b28e4-9f54-46cc-9ed5-4b3ade6d368f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72877738-574c-4a7a-8297-9c376cec239f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72877738-574c-4a7a-8297-9c376cec239f
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72877738-574c-4a7a-8297-9c376cec239f
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
correlation: qa-c192ef99-fcc5-4058-965c-5e333534a295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c192ef99-fcc5-4058-965c-5e333534a295
Content-Type: application/json

--- request body ---
{"handle":"qa-8745436ee4f6","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c192ef99-fcc5-4058-965c-5e333534a295
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c192ef99-fcc5-4058-965c-5e333534a295"}
```
