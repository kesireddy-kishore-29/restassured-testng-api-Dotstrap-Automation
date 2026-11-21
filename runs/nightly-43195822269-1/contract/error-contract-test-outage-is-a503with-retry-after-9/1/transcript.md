# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-d9e262a6-fed7-4627-a3ba-9335dcf94719` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-1708c3ad-589d-4d61-bc2a-f47d3e5305f5` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-aff3e474-ee67-443a-9dea-21d1d3e637c5` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-50b59979-4db2-4a9d-b430-12930a488484` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 5 | `qa-1add95f0-73a3-483a-a3ed-ecb36814558f` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-0449770a-cc97-4142-81d0-09108fb24c62` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b125c7b2-f64a-4d3b-8660-d06d4110925e` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-77550332-10e9-4298-90c8-23f20b286e4f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4ce57f03-f964-4a04-bdcf-17c8e97eb06d` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-ea31c2ae-6a82-4647-b32a-64df423bda7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d9e262a6-fed7-4627-a3ba-9335dcf94719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9e262a6-fed7-4627-a3ba-9335dcf94719
Content-Type: application/json

--- request body ---
{"handle":"qa-4ed4ff3ba85f","displayName":"QA 4ed4ff3ba85f","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9e262a6-fed7-4627-a3ba-9335dcf94719
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Location: /v1/accounts/qa-4ed4ff3ba85f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc305ee7-8ddf-4cbd-a635-5d0b8e9b1e2f","handle":"qa-4ed4ff3ba85f","displayName":"QA 4ed4ff3ba85f","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.482867733Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1708c3ad-589d-4d61-bc2a-f47d3e5305f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1708c3ad-589d-4d61-bc2a-f47d3e5305f5
Content-Type: application/json

--- request body ---
{"handle":"qa-c25246970bf3","displayName":"QA c25246970bf3","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1708c3ad-589d-4d61-bc2a-f47d3e5305f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Location: /v1/accounts/qa-c25246970bf3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f89a3eff-f02b-4a3a-9556-0a57edfeaf8c","handle":"qa-c25246970bf3","displayName":"QA c25246970bf3","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.508482453Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aff3e474-ee67-443a-9dea-21d1d3e637c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aff3e474-ee67-443a-9dea-21d1d3e637c5
Content-Type: application/json

--- request body ---
{"handle":"qa-4ed4ff3ba85f","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-aff3e474-ee67-443a-9dea-21d1d3e637c5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc305ee7-8ddf-4cbd-a635-5d0b8e9b1e2f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-50b59979-4db2-4a9d-b430-12930a488484

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50b59979-4db2-4a9d-b430-12930a488484
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c25246970bf3","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-50b59979-4db2-4a9d-b430-12930a488484
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
Location: /v1/conversations/cnv_7ae4e09b-94ae-464c-b922-47297f652885
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7ae4e09b-94ae-464c-b922-47297f652885","subject":"Error contract","status":"open","region":"eu","participants":["qa-4ed4ff3ba85f","qa-c25246970bf3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.586923096Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_7ae4e09b-94ae-464c-b922-47297f652885/messages
correlation: qa-1add95f0-73a3-483a-a3ed-ecb36814558f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3d598f91-398d-42f0-b258-87854fe18978
X-Correlation-Id: qa-1add95f0-73a3-483a-a3ed-ecb36814558f
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1add95f0-73a3-483a-a3ed-ecb36814558f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_7ae4e09b-94ae-464c-b922-47297f652885/messages","correlationId":"qa-1add95f0-73a3-483a-a3ed-ecb36814558f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0449770a-cc97-4142-81d0-09108fb24c62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0449770a-cc97-4142-81d0-09108fb24c62
Content-Type: application/json

--- request body ---
{"handle":"qa-c25246970bf3","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0449770a-cc97-4142-81d0-09108fb24c62
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f89a3eff-f02b-4a3a-9556-0a57edfeaf8c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b125c7b2-f64a-4d3b-8660-d06d4110925e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b125c7b2-f64a-4d3b-8660-d06d4110925e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b125c7b2-f64a-4d3b-8660-d06d4110925e
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
correlation: qa-77550332-10e9-4298-90c8-23f20b286e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77550332-10e9-4298-90c8-23f20b286e4f
Content-Type: application/json

--- request body ---
{"handle":"qa-c25246970bf3","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77550332-10e9-4298-90c8-23f20b286e4f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77550332-10e9-4298-90c8-23f20b286e4f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ce57f03-f964-4a04-bdcf-17c8e97eb06d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ce57f03-f964-4a04-bdcf-17c8e97eb06d
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ce57f03-f964-4a04-bdcf-17c8e97eb06d
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
correlation: qa-ea31c2ae-6a82-4647-b32a-64df423bda7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea31c2ae-6a82-4647-b32a-64df423bda7a
Content-Type: application/json

--- request body ---
{"handle":"qa-4ed4ff3ba85f","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea31c2ae-6a82-4647-b32a-64df423bda7a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ea31c2ae-6a82-4647-b32a-64df423bda7a"}
```
