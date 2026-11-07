# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-2d94c645-64ab-4124-9c61-853eb274c70b` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-31fca101-0c86-4b51-8516-42feefb14168` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-4c3489e3-d903-4229-97dd-f645f778a7c5` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-1949bcee-23c0-4861-af42-986df318b047` |
| 5 | `GET /v1/conversations/{id}` | 503 | 17 | `qa-4cc983fd-21ea-4ba9-93ae-6e2ba2206c0c` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-1bb8009d-fa15-4d59-8829-717bb46eb47f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-f5b17bd9-047b-4698-a742-5718380712c5` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-7985ac86-2b7b-4c8a-b47d-8a01143872c3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-8e1fc78b-23b6-4115-a824-2f180a6a5d1a` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-171b10f6-04f1-4f18-a677-e61773f852d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d94c645-64ab-4124-9c61-853eb274c70b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d94c645-64ab-4124-9c61-853eb274c70b
Content-Type: application/json

--- request body ---
{"handle":"qa-26d9401940bf","displayName":"QA 26d9401940bf","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d94c645-64ab-4124-9c61-853eb274c70b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Location: /v1/accounts/qa-26d9401940bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_93eba1f3-fe51-452a-a5a8-74383c63d908","handle":"qa-26d9401940bf","displayName":"QA 26d9401940bf","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.755839090Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-31fca101-0c86-4b51-8516-42feefb14168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31fca101-0c86-4b51-8516-42feefb14168
Content-Type: application/json

--- request body ---
{"handle":"qa-a7601f867299","displayName":"QA a7601f867299","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-31fca101-0c86-4b51-8516-42feefb14168
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Location: /v1/accounts/qa-a7601f867299
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f83a425-2b66-4fb9-b97b-dc8d3154ef15","handle":"qa-a7601f867299","displayName":"QA a7601f867299","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.787715034Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4c3489e3-d903-4229-97dd-f645f778a7c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c3489e3-d903-4229-97dd-f645f778a7c5
Content-Type: application/json

--- request body ---
{"handle":"qa-26d9401940bf","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c3489e3-d903-4229-97dd-f645f778a7c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_93eba1f3-fe51-452a-a5a8-74383c63d908"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1949bcee-23c0-4861-af42-986df318b047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1949bcee-23c0-4861-af42-986df318b047
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7601f867299","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1949bcee-23c0-4861-af42-986df318b047
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
Location: /v1/conversations/cnv_9874111a-1023-4acf-b9e4-e3f4d8181aad
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9874111a-1023-4acf-b9e4-e3f4d8181aad","subject":"Error contract","status":"open","region":"eu","participants":["qa-26d9401940bf","qa-a7601f867299"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.878594757Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_9874111a-1023-4acf-b9e4-e3f4d8181aad
correlation: qa-4cc983fd-21ea-4ba9-93ae-6e2ba2206c0c

--- request headers ---
Accept: application/json
X-Fault-Key: ea8ff405-0149-4a08-b536-83b48373e332
X-Fault: unavailable-once
X-Correlation-Id: qa-4cc983fd-21ea-4ba9-93ae-6e2ba2206c0c
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cc983fd-21ea-4ba9-93ae-6e2ba2206c0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_9874111a-1023-4acf-b9e4-e3f4d8181aad","correlationId":"qa-4cc983fd-21ea-4ba9-93ae-6e2ba2206c0c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1bb8009d-fa15-4d59-8829-717bb46eb47f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bb8009d-fa15-4d59-8829-717bb46eb47f
Content-Type: application/json

--- request body ---
{"handle":"qa-a7601f867299","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bb8009d-fa15-4d59-8829-717bb46eb47f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f83a425-2b66-4fb9-b97b-dc8d3154ef15"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5b17bd9-047b-4698-a742-5718380712c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b17bd9-047b-4698-a742-5718380712c5
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5b17bd9-047b-4698-a742-5718380712c5
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
correlation: qa-7985ac86-2b7b-4c8a-b47d-8a01143872c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7985ac86-2b7b-4c8a-b47d-8a01143872c3
Content-Type: application/json

--- request body ---
{"handle":"qa-a7601f867299","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7985ac86-2b7b-4c8a-b47d-8a01143872c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7985ac86-2b7b-4c8a-b47d-8a01143872c3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e1fc78b-23b6-4115-a824-2f180a6a5d1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e1fc78b-23b6-4115-a824-2f180a6a5d1a
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e1fc78b-23b6-4115-a824-2f180a6a5d1a
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
correlation: qa-171b10f6-04f1-4f18-a677-e61773f852d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-171b10f6-04f1-4f18-a677-e61773f852d8
Content-Type: application/json

--- request body ---
{"handle":"qa-26d9401940bf","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-171b10f6-04f1-4f18-a677-e61773f852d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-171b10f6-04f1-4f18-a677-e61773f852d8"}
```
