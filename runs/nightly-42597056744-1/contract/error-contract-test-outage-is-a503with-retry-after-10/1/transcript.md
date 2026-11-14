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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-ac9b5e40-cb3e-47fb-95da-8550d38c4d53` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-fc686a65-9fd6-4a7c-aa6b-e8242cd3398a` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-f94c929e-20ff-4876-a96e-ee5963bc9a2d` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-a492ecef-879e-47f5-b735-b20ddf09f182` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 12 | `qa-e9fc265f-9502-4e6c-82d2-f140ebe4e7fc` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-c5b9da20-1fcd-47a2-9460-8426a299521b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ecb536d8-6758-4179-ac70-b1df7e5f7f1d` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-2da70982-0458-4474-921f-f1bf0fc2e64a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-76f3374c-942d-473d-8bdf-1d7f18b6b850` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-b7280d8c-5abf-4dd5-bdb5-d4ed358d3bc2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ac9b5e40-cb3e-47fb-95da-8550d38c4d53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac9b5e40-cb3e-47fb-95da-8550d38c4d53
Content-Type: application/json

--- request body ---
{"handle":"qa-300fdb3deaf3","displayName":"QA 300fdb3deaf3","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac9b5e40-cb3e-47fb-95da-8550d38c4d53
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
Location: /v1/accounts/qa-300fdb3deaf3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9c5b63ca-4d34-4bb6-8a94-4bc50ee45e00","handle":"qa-300fdb3deaf3","displayName":"QA 300fdb3deaf3","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.304491509Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fc686a65-9fd6-4a7c-aa6b-e8242cd3398a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc686a65-9fd6-4a7c-aa6b-e8242cd3398a
Content-Type: application/json

--- request body ---
{"handle":"qa-9cc5536998fe","displayName":"QA 9cc5536998fe","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc686a65-9fd6-4a7c-aa6b-e8242cd3398a
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
Location: /v1/accounts/qa-9cc5536998fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5872d56-7fb9-4997-8abf-3440459925f1","handle":"qa-9cc5536998fe","displayName":"QA 9cc5536998fe","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.328399045Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f94c929e-20ff-4876-a96e-ee5963bc9a2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f94c929e-20ff-4876-a96e-ee5963bc9a2d
Content-Type: application/json

--- request body ---
{"handle":"qa-300fdb3deaf3","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f94c929e-20ff-4876-a96e-ee5963bc9a2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9c5b63ca-4d34-4bb6-8a94-4bc50ee45e00"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a492ecef-879e-47f5-b735-b20ddf09f182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a492ecef-879e-47f5-b735-b20ddf09f182
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9cc5536998fe","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a492ecef-879e-47f5-b735-b20ddf09f182
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
Location: /v1/conversations/cnv_dc10fa54-2280-4774-9cc9-b030e5a0b55e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dc10fa54-2280-4774-9cc9-b030e5a0b55e","subject":"Error contract","status":"open","region":"eu","participants":["qa-300fdb3deaf3","qa-9cc5536998fe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.376136609Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_dc10fa54-2280-4774-9cc9-b030e5a0b55e/messages
correlation: qa-e9fc265f-9502-4e6c-82d2-f140ebe4e7fc

--- request headers ---
Accept: application/json
X-Fault-Key: a80df2f1-3c4d-4f75-8fa0-25a941528e83
X-Fault: unavailable-once
X-Correlation-Id: qa-e9fc265f-9502-4e6c-82d2-f140ebe4e7fc
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9fc265f-9502-4e6c-82d2-f140ebe4e7fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_dc10fa54-2280-4774-9cc9-b030e5a0b55e/messages","correlationId":"qa-e9fc265f-9502-4e6c-82d2-f140ebe4e7fc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c5b9da20-1fcd-47a2-9460-8426a299521b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5b9da20-1fcd-47a2-9460-8426a299521b
Content-Type: application/json

--- request body ---
{"handle":"qa-9cc5536998fe","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5b9da20-1fcd-47a2-9460-8426a299521b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5872d56-7fb9-4997-8abf-3440459925f1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecb536d8-6758-4179-ac70-b1df7e5f7f1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb536d8-6758-4179-ac70-b1df7e5f7f1d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecb536d8-6758-4179-ac70-b1df7e5f7f1d
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
correlation: qa-2da70982-0458-4474-921f-f1bf0fc2e64a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da70982-0458-4474-921f-f1bf0fc2e64a
Content-Type: application/json

--- request body ---
{"handle":"qa-9cc5536998fe","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2da70982-0458-4474-921f-f1bf0fc2e64a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2da70982-0458-4474-921f-f1bf0fc2e64a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76f3374c-942d-473d-8bdf-1d7f18b6b850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76f3374c-942d-473d-8bdf-1d7f18b6b850
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76f3374c-942d-473d-8bdf-1d7f18b6b850
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
correlation: qa-b7280d8c-5abf-4dd5-bdb5-d4ed358d3bc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7280d8c-5abf-4dd5-bdb5-d4ed358d3bc2
Content-Type: application/json

--- request body ---
{"handle":"qa-300fdb3deaf3","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7280d8c-5abf-4dd5-bdb5-d4ed358d3bc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7280d8c-5abf-4dd5-bdb5-d4ed358d3bc2"}
```
