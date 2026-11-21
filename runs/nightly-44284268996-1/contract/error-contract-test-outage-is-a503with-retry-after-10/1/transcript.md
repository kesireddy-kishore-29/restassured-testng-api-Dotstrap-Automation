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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-f4b6e11c-dbc3-4a5a-92b7-1f11e8f8728d` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-3786602c-73c6-4614-bae8-1f4c469365ab` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-a1895dc6-1f5c-4d6e-b3da-67fd284a23da` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-8804578b-1ae0-45fa-b227-23f7dde41afe` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 13 | `qa-0dfb4db6-ea7b-419d-b5c0-5e341df2c4f4` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-2a565f56-abe6-4ab4-8124-1701823fb12c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c7b3c677-b048-4649-a6a9-dd75a4a35f60` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-b40dc99a-9c14-4bab-83f4-253d19c07e72` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b3854864-4cd1-48e2-9386-1d2d14a4aef2` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-564ca82e-f758-499b-b8e3-0b5b747a7803` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4b6e11c-dbc3-4a5a-92b7-1f11e8f8728d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b6e11c-dbc3-4a5a-92b7-1f11e8f8728d
Content-Type: application/json

--- request body ---
{"handle":"qa-2f064875bb87","displayName":"QA 2f064875bb87","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b6e11c-dbc3-4a5a-92b7-1f11e8f8728d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-2f064875bb87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9be21530-68e7-4c0e-a1ca-4e5918a42e3a","handle":"qa-2f064875bb87","displayName":"QA 2f064875bb87","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.186808404Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3786602c-73c6-4614-bae8-1f4c469365ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3786602c-73c6-4614-bae8-1f4c469365ab
Content-Type: application/json

--- request body ---
{"handle":"qa-1367c7d95d67","displayName":"QA 1367c7d95d67","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3786602c-73c6-4614-bae8-1f4c469365ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-1367c7d95d67
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e58019bb-bb88-4973-8a21-03ee7110b7c8","handle":"qa-1367c7d95d67","displayName":"QA 1367c7d95d67","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.228221147Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a1895dc6-1f5c-4d6e-b3da-67fd284a23da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1895dc6-1f5c-4d6e-b3da-67fd284a23da
Content-Type: application/json

--- request body ---
{"handle":"qa-2f064875bb87","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1895dc6-1f5c-4d6e-b3da-67fd284a23da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9be21530-68e7-4c0e-a1ca-4e5918a42e3a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8804578b-1ae0-45fa-b227-23f7dde41afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8804578b-1ae0-45fa-b227-23f7dde41afe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1367c7d95d67","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8804578b-1ae0-45fa-b227-23f7dde41afe
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
Location: /v1/conversations/cnv_1cd57f66-4de7-4169-85f0-9d708ae3bd5b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1cd57f66-4de7-4169-85f0-9d708ae3bd5b","subject":"Error contract","status":"open","region":"eu","participants":["qa-2f064875bb87","qa-1367c7d95d67"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.306993546Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1cd57f66-4de7-4169-85f0-9d708ae3bd5b/messages
correlation: qa-0dfb4db6-ea7b-419d-b5c0-5e341df2c4f4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 21b5a82b-015f-40b4-b72b-1ef094650e6f
X-Correlation-Id: qa-0dfb4db6-ea7b-419d-b5c0-5e341df2c4f4
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dfb4db6-ea7b-419d-b5c0-5e341df2c4f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1cd57f66-4de7-4169-85f0-9d708ae3bd5b/messages","correlationId":"qa-0dfb4db6-ea7b-419d-b5c0-5e341df2c4f4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2a565f56-abe6-4ab4-8124-1701823fb12c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a565f56-abe6-4ab4-8124-1701823fb12c
Content-Type: application/json

--- request body ---
{"handle":"qa-1367c7d95d67","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a565f56-abe6-4ab4-8124-1701823fb12c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e58019bb-bb88-4973-8a21-03ee7110b7c8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7b3c677-b048-4649-a6a9-dd75a4a35f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7b3c677-b048-4649-a6a9-dd75a4a35f60
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7b3c677-b048-4649-a6a9-dd75a4a35f60
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
correlation: qa-b40dc99a-9c14-4bab-83f4-253d19c07e72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40dc99a-9c14-4bab-83f4-253d19c07e72
Content-Type: application/json

--- request body ---
{"handle":"qa-1367c7d95d67","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b40dc99a-9c14-4bab-83f4-253d19c07e72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b40dc99a-9c14-4bab-83f4-253d19c07e72"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3854864-4cd1-48e2-9386-1d2d14a4aef2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3854864-4cd1-48e2-9386-1d2d14a4aef2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3854864-4cd1-48e2-9386-1d2d14a4aef2
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
correlation: qa-564ca82e-f758-499b-b8e3-0b5b747a7803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-564ca82e-f758-499b-b8e3-0b5b747a7803
Content-Type: application/json

--- request body ---
{"handle":"qa-2f064875bb87","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-564ca82e-f758-499b-b8e3-0b5b747a7803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-564ca82e-f758-499b-b8e3-0b5b747a7803"}
```
