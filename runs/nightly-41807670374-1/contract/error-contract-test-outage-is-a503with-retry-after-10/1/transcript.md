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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-d0ce640c-21ec-4573-865a-d923dc02b88f` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-17d431f8-f7cf-4d75-a6d5-57ec3952ad8b` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-f2c8f1a8-5078-4545-9e0b-8eee59a72efc` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-b1e8c48d-b802-4546-aaac-470dda4fe7d5` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 13 | `qa-53b3bc5e-1552-49cf-9ab6-a2ec4aa2a0e5` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-6a22a0b1-f2bc-4754-995e-349b8a49f880` |
| 7 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-c16a1bc2-6ec3-4d59-95ab-af9839a1269a` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-1e2b3c82-f4f4-424e-9239-89cc5fca41bf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-847b7604-82a6-4f2f-8532-9eb50447c171` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-364f9ac2-c515-45dd-985f-5d2f13cf1ba7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0ce640c-21ec-4573-865a-d923dc02b88f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ce640c-21ec-4573-865a-d923dc02b88f
Content-Type: application/json

--- request body ---
{"handle":"qa-b5304424662e","displayName":"QA b5304424662e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0ce640c-21ec-4573-865a-d923dc02b88f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 9
Location: /v1/accounts/qa-b5304424662e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78f42c8f-ae4c-432b-8b87-7f9a0205eea5","handle":"qa-b5304424662e","displayName":"QA b5304424662e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.861154179Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17d431f8-f7cf-4d75-a6d5-57ec3952ad8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d431f8-f7cf-4d75-a6d5-57ec3952ad8b
Content-Type: application/json

--- request body ---
{"handle":"qa-a1023d8c6ffb","displayName":"QA a1023d8c6ffb","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d431f8-f7cf-4d75-a6d5-57ec3952ad8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 9
Location: /v1/accounts/qa-a1023d8c6ffb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ebb0d9d-0a3c-41ff-8393-56617da0e33d","handle":"qa-a1023d8c6ffb","displayName":"QA a1023d8c6ffb","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.899963962Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f2c8f1a8-5078-4545-9e0b-8eee59a72efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c8f1a8-5078-4545-9e0b-8eee59a72efc
Content-Type: application/json

--- request body ---
{"handle":"qa-b5304424662e","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2c8f1a8-5078-4545-9e0b-8eee59a72efc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78f42c8f-ae4c-432b-8b87-7f9a0205eea5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b1e8c48d-b802-4546-aaac-470dda4fe7d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1e8c48d-b802-4546-aaac-470dda4fe7d5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a1023d8c6ffb","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1e8c48d-b802-4546-aaac-470dda4fe7d5
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
Location: /v1/conversations/cnv_0f6e2595-3a27-4727-992a-c2973a4308e5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0f6e2595-3a27-4727-992a-c2973a4308e5","subject":"Error contract","status":"open","region":"eu","participants":["qa-b5304424662e","qa-a1023d8c6ffb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.971383523Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0f6e2595-3a27-4727-992a-c2973a4308e5/messages
correlation: qa-53b3bc5e-1552-49cf-9ab6-a2ec4aa2a0e5

--- request headers ---
Accept: application/json
X-Fault-Key: 3177184f-5f69-4c1d-bf2c-02ec6209661a
X-Fault: unavailable-once
X-Correlation-Id: qa-53b3bc5e-1552-49cf-9ab6-a2ec4aa2a0e5
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53b3bc5e-1552-49cf-9ab6-a2ec4aa2a0e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_0f6e2595-3a27-4727-992a-c2973a4308e5/messages","correlationId":"qa-53b3bc5e-1552-49cf-9ab6-a2ec4aa2a0e5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6a22a0b1-f2bc-4754-995e-349b8a49f880

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a22a0b1-f2bc-4754-995e-349b8a49f880
Content-Type: application/json

--- request body ---
{"handle":"qa-a1023d8c6ffb","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a22a0b1-f2bc-4754-995e-349b8a49f880
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ebb0d9d-0a3c-41ff-8393-56617da0e33d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c16a1bc2-6ec3-4d59-95ab-af9839a1269a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c16a1bc2-6ec3-4d59-95ab-af9839a1269a
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c16a1bc2-6ec3-4d59-95ab-af9839a1269a
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
correlation: qa-1e2b3c82-f4f4-424e-9239-89cc5fca41bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e2b3c82-f4f4-424e-9239-89cc5fca41bf
Content-Type: application/json

--- request body ---
{"handle":"qa-a1023d8c6ffb","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e2b3c82-f4f4-424e-9239-89cc5fca41bf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e2b3c82-f4f4-424e-9239-89cc5fca41bf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-847b7604-82a6-4f2f-8532-9eb50447c171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-847b7604-82a6-4f2f-8532-9eb50447c171
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-847b7604-82a6-4f2f-8532-9eb50447c171
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
correlation: qa-364f9ac2-c515-45dd-985f-5d2f13cf1ba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-364f9ac2-c515-45dd-985f-5d2f13cf1ba7
Content-Type: application/json

--- request body ---
{"handle":"qa-b5304424662e","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-364f9ac2-c515-45dd-985f-5d2f13cf1ba7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-364f9ac2-c515-45dd-985f-5d2f13cf1ba7"}
```
