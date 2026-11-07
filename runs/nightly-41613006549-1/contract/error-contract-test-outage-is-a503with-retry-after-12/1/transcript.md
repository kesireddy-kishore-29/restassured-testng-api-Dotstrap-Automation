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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-5cbbed7a-7b39-424c-b692-5d1076ad80a4` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-63561450-9272-47f4-9dc3-a2370b92c944` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-112c79a6-9dd6-44e2-8ed5-21697acc9238` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-9606b271-c377-4acb-838f-2de1d6558159` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 5 | `qa-8014360b-1943-4a6d-83d0-60b68aa590d0` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-c550bcbc-e1d0-44d7-befd-0072912c4b92` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-24951070-f9d5-46bc-8c44-a033be2a9a72` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-b9996bd2-e7f9-401e-b6b2-03cd6c5b0936` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-d6e2c558-d2d8-467c-9293-cfff613fba3a` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-fcb8107a-0ac2-4d80-ac30-fa060e4c050c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5cbbed7a-7b39-424c-b692-5d1076ad80a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cbbed7a-7b39-424c-b692-5d1076ad80a4
Content-Type: application/json

--- request body ---
{"handle":"qa-9ddf5a3575de","displayName":"QA 9ddf5a3575de","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cbbed7a-7b39-424c-b692-5d1076ad80a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Location: /v1/accounts/qa-9ddf5a3575de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5caa6a5-0098-435a-8454-19ee4d91a371","handle":"qa-9ddf5a3575de","displayName":"QA 9ddf5a3575de","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.096684921Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-63561450-9272-47f4-9dc3-a2370b92c944

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63561450-9272-47f4-9dc3-a2370b92c944
Content-Type: application/json

--- request body ---
{"handle":"qa-0d3ba4ca12bb","displayName":"QA 0d3ba4ca12bb","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-63561450-9272-47f4-9dc3-a2370b92c944
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
Location: /v1/accounts/qa-0d3ba4ca12bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d911f041-d2bb-450e-9d09-c642f6bcf424","handle":"qa-0d3ba4ca12bb","displayName":"QA 0d3ba4ca12bb","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.151261399Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-112c79a6-9dd6-44e2-8ed5-21697acc9238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112c79a6-9dd6-44e2-8ed5-21697acc9238
Content-Type: application/json

--- request body ---
{"handle":"qa-9ddf5a3575de","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-112c79a6-9dd6-44e2-8ed5-21697acc9238
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5caa6a5-0098-435a-8454-19ee4d91a371"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9606b271-c377-4acb-838f-2de1d6558159

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9606b271-c377-4acb-838f-2de1d6558159
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0d3ba4ca12bb","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9606b271-c377-4acb-838f-2de1d6558159
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
Location: /v1/conversations/cnv_e85f6b07-d19f-43bd-ab3d-4b7eabca46a7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e85f6b07-d19f-43bd-ab3d-4b7eabca46a7","subject":"Error contract","status":"open","region":"eu","participants":["qa-9ddf5a3575de","qa-0d3ba4ca12bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.207015702Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e85f6b07-d19f-43bd-ab3d-4b7eabca46a7/close
correlation: qa-8014360b-1943-4a6d-83d0-60b68aa590d0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 67b5a889-3bd2-4558-b6bb-4b3c75d4b735
X-Correlation-Id: qa-8014360b-1943-4a6d-83d0-60b68aa590d0
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8014360b-1943-4a6d-83d0-60b68aa590d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_e85f6b07-d19f-43bd-ab3d-4b7eabca46a7/close","correlationId":"qa-8014360b-1943-4a6d-83d0-60b68aa590d0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c550bcbc-e1d0-44d7-befd-0072912c4b92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c550bcbc-e1d0-44d7-befd-0072912c4b92
Content-Type: application/json

--- request body ---
{"handle":"qa-0d3ba4ca12bb","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c550bcbc-e1d0-44d7-befd-0072912c4b92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d911f041-d2bb-450e-9d09-c642f6bcf424"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24951070-f9d5-46bc-8c44-a033be2a9a72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24951070-f9d5-46bc-8c44-a033be2a9a72
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24951070-f9d5-46bc-8c44-a033be2a9a72
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
correlation: qa-b9996bd2-e7f9-401e-b6b2-03cd6c5b0936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9996bd2-e7f9-401e-b6b2-03cd6c5b0936
Content-Type: application/json

--- request body ---
{"handle":"qa-0d3ba4ca12bb","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9996bd2-e7f9-401e-b6b2-03cd6c5b0936
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9996bd2-e7f9-401e-b6b2-03cd6c5b0936"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d6e2c558-d2d8-467c-9293-cfff613fba3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6e2c558-d2d8-467c-9293-cfff613fba3a
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d6e2c558-d2d8-467c-9293-cfff613fba3a
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
correlation: qa-fcb8107a-0ac2-4d80-ac30-fa060e4c050c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcb8107a-0ac2-4d80-ac30-fa060e4c050c
Content-Type: application/json

--- request body ---
{"handle":"qa-9ddf5a3575de","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcb8107a-0ac2-4d80-ac30-fa060e4c050c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fcb8107a-0ac2-4d80-ac30-fa060e4c050c"}
```
