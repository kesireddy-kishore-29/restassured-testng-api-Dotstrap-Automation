# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-71c18f83-be97-4030-b1a2-ec8eaadaed01` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-84583a7c-bf4b-461d-8194-400e8ecfd0c3` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-ecb584f9-063b-4905-b386-83580371c358` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-efd840c7-a0c8-4d87-87c2-29c70567afd7` |
| 5 | `PATCH /v1/accounts/me` | 400 | 23 | `qa-cf72d4f5-b4e6-4e41-b46d-139024bd2c0e` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-04bd3890-672b-4ad1-9259-b87a84c809e0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-aa21a579-a1ad-4f9e-ba4d-5d7f8cda8d3b` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-7f50b9c9-1166-4965-be1a-59b12aacb1da` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-54b2adaf-6dfb-4a84-af0c-762eb3b405f4` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-1f029e86-62bd-4b63-8c3e-c507ca55df9e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-71c18f83-be97-4030-b1a2-ec8eaadaed01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71c18f83-be97-4030-b1a2-ec8eaadaed01
Content-Type: application/json

--- request body ---
{"handle":"qa-00b1ef7197ea","displayName":"QA 00b1ef7197ea","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-71c18f83-be97-4030-b1a2-ec8eaadaed01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-00b1ef7197ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d896941e-c9cd-4774-8958-86cb4ac4435a","handle":"qa-00b1ef7197ea","displayName":"QA 00b1ef7197ea","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.093577289Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-84583a7c-bf4b-461d-8194-400e8ecfd0c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84583a7c-bf4b-461d-8194-400e8ecfd0c3
Content-Type: application/json

--- request body ---
{"handle":"qa-794acf40f388","displayName":"QA 794acf40f388","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-84583a7c-bf4b-461d-8194-400e8ecfd0c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Location: /v1/accounts/qa-794acf40f388
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4db92531-3231-47e9-8300-6d095ad11c61","handle":"qa-794acf40f388","displayName":"QA 794acf40f388","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.168698566Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ecb584f9-063b-4905-b386-83580371c358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb584f9-063b-4905-b386-83580371c358
Content-Type: application/json

--- request body ---
{"handle":"qa-00b1ef7197ea","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecb584f9-063b-4905-b386-83580371c358
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d896941e-c9cd-4774-8958-86cb4ac4435a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-efd840c7-a0c8-4d87-87c2-29c70567afd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efd840c7-a0c8-4d87-87c2-29c70567afd7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-794acf40f388","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-efd840c7-a0c8-4d87-87c2-29c70567afd7
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
Location: /v1/conversations/cnv_3b14f43b-1786-4548-89c6-1ad6e888af41
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3b14f43b-1786-4548-89c6-1ad6e888af41","subject":"Error contract","status":"open","region":"eu","participants":["qa-00b1ef7197ea","qa-794acf40f388"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.237996828Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cf72d4f5-b4e6-4e41-b46d-139024bd2c0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf72d4f5-b4e6-4e41-b46d-139024bd2c0e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf72d4f5-b4e6-4e41-b46d-139024bd2c0e
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-cf72d4f5-b4e6-4e41-b46d-139024bd2c0e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-04bd3890-672b-4ad1-9259-b87a84c809e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04bd3890-672b-4ad1-9259-b87a84c809e0
Content-Type: application/json

--- request body ---
{"handle":"qa-794acf40f388","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-04bd3890-672b-4ad1-9259-b87a84c809e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4db92531-3231-47e9-8300-6d095ad11c61"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa21a579-a1ad-4f9e-ba4d-5d7f8cda8d3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa21a579-a1ad-4f9e-ba4d-5d7f8cda8d3b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa21a579-a1ad-4f9e-ba4d-5d7f8cda8d3b
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
correlation: qa-7f50b9c9-1166-4965-be1a-59b12aacb1da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f50b9c9-1166-4965-be1a-59b12aacb1da
Content-Type: application/json

--- request body ---
{"handle":"qa-794acf40f388","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f50b9c9-1166-4965-be1a-59b12aacb1da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f50b9c9-1166-4965-be1a-59b12aacb1da"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54b2adaf-6dfb-4a84-af0c-762eb3b405f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54b2adaf-6dfb-4a84-af0c-762eb3b405f4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54b2adaf-6dfb-4a84-af0c-762eb3b405f4
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1f029e86-62bd-4b63-8c3e-c507ca55df9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f029e86-62bd-4b63-8c3e-c507ca55df9e
Content-Type: application/json

--- request body ---
{"handle":"qa-00b1ef7197ea","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f029e86-62bd-4b63-8c3e-c507ca55df9e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f029e86-62bd-4b63-8c3e-c507ca55df9e"}
```
