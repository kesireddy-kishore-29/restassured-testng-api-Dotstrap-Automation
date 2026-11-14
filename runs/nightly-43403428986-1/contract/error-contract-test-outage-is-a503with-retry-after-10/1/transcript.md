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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-6804317b-5873-4f19-beaf-61c057009400` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-8ca814fb-6a9f-400d-a54f-65534b91c260` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-00474485-9a96-4a5f-9359-db0f7d03cd01` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-03359495-25e1-4230-99c2-0cac009a7be2` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 14 | `qa-cdb856ed-0256-4c20-9659-22fd4bbcd492` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-0b6ea3c2-6fda-4ad9-a163-4aef54f5610a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d553a8c5-dd2d-4c67-88d7-e07ea633474c` |
| 8 | `POST /v1/auth/token` | 401 | 52 | `qa-50edd846-980f-414a-9171-ae445587ec00` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-58352ff7-fbee-4653-aa7a-a752d4d37ce0` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-00cba203-7bb2-459d-9f9c-960969884c68` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6804317b-5873-4f19-beaf-61c057009400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6804317b-5873-4f19-beaf-61c057009400
Content-Type: application/json

--- request body ---
{"handle":"qa-82960098a77c","displayName":"QA 82960098a77c","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6804317b-5873-4f19-beaf-61c057009400
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-82960098a77c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8fdb2c27-b215-43ba-b26a-a289648b6496","handle":"qa-82960098a77c","displayName":"QA 82960098a77c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.622628144Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8ca814fb-6a9f-400d-a54f-65534b91c260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ca814fb-6a9f-400d-a54f-65534b91c260
Content-Type: application/json

--- request body ---
{"handle":"qa-ee5ea27df5ee","displayName":"QA ee5ea27df5ee","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ca814fb-6a9f-400d-a54f-65534b91c260
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-ee5ea27df5ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_053b6128-e39e-4501-a03d-7f341e7f0e74","handle":"qa-ee5ea27df5ee","displayName":"QA ee5ea27df5ee","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.673097078Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-00474485-9a96-4a5f-9359-db0f7d03cd01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00474485-9a96-4a5f-9359-db0f7d03cd01
Content-Type: application/json

--- request body ---
{"handle":"qa-82960098a77c","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-00474485-9a96-4a5f-9359-db0f7d03cd01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fdb2c27-b215-43ba-b26a-a289648b6496"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-03359495-25e1-4230-99c2-0cac009a7be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03359495-25e1-4230-99c2-0cac009a7be2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ee5ea27df5ee","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-03359495-25e1-4230-99c2-0cac009a7be2
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
Location: /v1/conversations/cnv_356cfd0c-e6dd-4f74-a9b3-d33a8fb0c7c2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_356cfd0c-e6dd-4f74-a9b3-d33a8fb0c7c2","subject":"Error contract","status":"open","region":"eu","participants":["qa-82960098a77c","qa-ee5ea27df5ee"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.735180501Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_356cfd0c-e6dd-4f74-a9b3-d33a8fb0c7c2/messages
correlation: qa-cdb856ed-0256-4c20-9659-22fd4bbcd492

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6dd721ac-7866-4e94-bb0e-495bfb73095d
X-Correlation-Id: qa-cdb856ed-0256-4c20-9659-22fd4bbcd492
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdb856ed-0256-4c20-9659-22fd4bbcd492
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_356cfd0c-e6dd-4f74-a9b3-d33a8fb0c7c2/messages","correlationId":"qa-cdb856ed-0256-4c20-9659-22fd4bbcd492"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0b6ea3c2-6fda-4ad9-a163-4aef54f5610a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b6ea3c2-6fda-4ad9-a163-4aef54f5610a
Content-Type: application/json

--- request body ---
{"handle":"qa-ee5ea27df5ee","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b6ea3c2-6fda-4ad9-a163-4aef54f5610a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_053b6128-e39e-4501-a03d-7f341e7f0e74"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d553a8c5-dd2d-4c67-88d7-e07ea633474c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d553a8c5-dd2d-4c67-88d7-e07ea633474c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d553a8c5-dd2d-4c67-88d7-e07ea633474c
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
correlation: qa-50edd846-980f-414a-9171-ae445587ec00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50edd846-980f-414a-9171-ae445587ec00
Content-Type: application/json

--- request body ---
{"handle":"qa-ee5ea27df5ee","password":"****"}

--- response: 401 in 52 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50edd846-980f-414a-9171-ae445587ec00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50edd846-980f-414a-9171-ae445587ec00"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58352ff7-fbee-4653-aa7a-a752d4d37ce0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58352ff7-fbee-4653-aa7a-a752d4d37ce0
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58352ff7-fbee-4653-aa7a-a752d4d37ce0
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
correlation: qa-00cba203-7bb2-459d-9f9c-960969884c68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00cba203-7bb2-459d-9f9c-960969884c68
Content-Type: application/json

--- request body ---
{"handle":"qa-82960098a77c","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00cba203-7bb2-459d-9f9c-960969884c68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-00cba203-7bb2-459d-9f9c-960969884c68"}
```
