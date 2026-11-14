# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-5e3e82ae-d383-4640-b6b4-70ef5faa7497` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-576a07f2-c116-499c-8d90-a8578bd058bd` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-8f2b3fad-685e-436b-95c9-26cf2682c1c4` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-d0a006db-0f20-4f61-8ae0-ebaec90de4e7` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 11 | `qa-e53cce3f-9e50-45bc-814a-8ee7a1b725b9` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-8f244510-abba-4af2-add7-54284f86d102` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-8ace0eaf-db6a-4301-a8b9-a94efc8ca55f` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-2e908e40-4085-467e-908c-6db75a68365e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-15a3db97-b0df-4959-9866-2f9d63f219f4` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-da93d2b2-770b-4faf-82e6-02c6b81d83f8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e3e82ae-d383-4640-b6b4-70ef5faa7497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e3e82ae-d383-4640-b6b4-70ef5faa7497
Content-Type: application/json

--- request body ---
{"handle":"qa-b57cd6e870ab","displayName":"QA b57cd6e870ab","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e3e82ae-d383-4640-b6b4-70ef5faa7497
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
Location: /v1/accounts/qa-b57cd6e870ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b6b0e0f-56ba-4285-9cb2-5b1221335cad","handle":"qa-b57cd6e870ab","displayName":"QA b57cd6e870ab","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.232036433Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-576a07f2-c116-499c-8d90-a8578bd058bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-576a07f2-c116-499c-8d90-a8578bd058bd
Content-Type: application/json

--- request body ---
{"handle":"qa-995651810d3c","displayName":"QA 995651810d3c","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-576a07f2-c116-499c-8d90-a8578bd058bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Location: /v1/accounts/qa-995651810d3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f16a1dbe-0155-4c68-863c-762ab48c4a6e","handle":"qa-995651810d3c","displayName":"QA 995651810d3c","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.279648543Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f2b3fad-685e-436b-95c9-26cf2682c1c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2b3fad-685e-436b-95c9-26cf2682c1c4
Content-Type: application/json

--- request body ---
{"handle":"qa-b57cd6e870ab","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2b3fad-685e-436b-95c9-26cf2682c1c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b6b0e0f-56ba-4285-9cb2-5b1221335cad"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d0a006db-0f20-4f61-8ae0-ebaec90de4e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a006db-0f20-4f61-8ae0-ebaec90de4e7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-995651810d3c","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0a006db-0f20-4f61-8ae0-ebaec90de4e7
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
Location: /v1/conversations/cnv_b80d4201-7cd5-4d9d-af08-7f55fc1362ea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b80d4201-7cd5-4d9d-af08-7f55fc1362ea","subject":"Error contract","status":"open","region":"eu","participants":["qa-b57cd6e870ab","qa-995651810d3c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.317510926Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b80d4201-7cd5-4d9d-af08-7f55fc1362ea/close
correlation: qa-e53cce3f-9e50-45bc-814a-8ee7a1b725b9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 96725fd9-28d8-4850-9e7b-9b07f565f6cd
X-Correlation-Id: qa-e53cce3f-9e50-45bc-814a-8ee7a1b725b9
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e53cce3f-9e50-45bc-814a-8ee7a1b725b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_b80d4201-7cd5-4d9d-af08-7f55fc1362ea/close","correlationId":"qa-e53cce3f-9e50-45bc-814a-8ee7a1b725b9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8f244510-abba-4af2-add7-54284f86d102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f244510-abba-4af2-add7-54284f86d102
Content-Type: application/json

--- request body ---
{"handle":"qa-995651810d3c","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f244510-abba-4af2-add7-54284f86d102
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f16a1dbe-0155-4c68-863c-762ab48c4a6e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ace0eaf-db6a-4301-a8b9-a94efc8ca55f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ace0eaf-db6a-4301-a8b9-a94efc8ca55f
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ace0eaf-db6a-4301-a8b9-a94efc8ca55f
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
correlation: qa-2e908e40-4085-467e-908c-6db75a68365e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e908e40-4085-467e-908c-6db75a68365e
Content-Type: application/json

--- request body ---
{"handle":"qa-995651810d3c","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e908e40-4085-467e-908c-6db75a68365e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e908e40-4085-467e-908c-6db75a68365e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15a3db97-b0df-4959-9866-2f9d63f219f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a3db97-b0df-4959-9866-2f9d63f219f4
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15a3db97-b0df-4959-9866-2f9d63f219f4
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
correlation: qa-da93d2b2-770b-4faf-82e6-02c6b81d83f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da93d2b2-770b-4faf-82e6-02c6b81d83f8
Content-Type: application/json

--- request body ---
{"handle":"qa-b57cd6e870ab","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da93d2b2-770b-4faf-82e6-02c6b81d83f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da93d2b2-770b-4faf-82e6-02c6b81d83f8"}
```
