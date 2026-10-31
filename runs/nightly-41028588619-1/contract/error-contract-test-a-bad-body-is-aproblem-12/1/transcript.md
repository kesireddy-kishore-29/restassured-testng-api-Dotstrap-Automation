# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-b8dbb42a-065f-401c-ac91-62815d8f7e17` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-59bdebaa-3a6b-4896-85ab-a04acf8f7cea` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-ba4f8c0e-d77d-4a83-b8c4-d35c237ba7cc` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-d2a552f1-6ae1-4c80-8ea2-3a2ca6a8eec9` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 24 | `qa-8011b8bd-b4f7-4bb7-ace3-683d04e311d7` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-fe9a19f9-bb73-45be-9383-52b61d47c6ad` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-82b8aa67-458d-4858-b684-a1adb5443918` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-e87dd49f-2070-48cb-b566-23589cd9d46f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-2f2f08e2-e1a3-473b-9cd1-c1348279b76d` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-f634938f-79da-4ff3-b3f3-f54dc63bb55a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b8dbb42a-065f-401c-ac91-62815d8f7e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8dbb42a-065f-401c-ac91-62815d8f7e17
Content-Type: application/json

--- request body ---
{"handle":"qa-aaf8b3c07f65","displayName":"QA aaf8b3c07f65","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8dbb42a-065f-401c-ac91-62815d8f7e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Location: /v1/accounts/qa-aaf8b3c07f65
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba18b4d1-04ad-4b32-88dc-c49cc3a5d645","handle":"qa-aaf8b3c07f65","displayName":"QA aaf8b3c07f65","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.996283514Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-59bdebaa-3a6b-4896-85ab-a04acf8f7cea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59bdebaa-3a6b-4896-85ab-a04acf8f7cea
Content-Type: application/json

--- request body ---
{"handle":"qa-2a33d8de237a","displayName":"QA 2a33d8de237a","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-59bdebaa-3a6b-4896-85ab-a04acf8f7cea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Location: /v1/accounts/qa-2a33d8de237a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc2c2667-3026-4787-b650-052d26d4c592","handle":"qa-2a33d8de237a","displayName":"QA 2a33d8de237a","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.059233392Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba4f8c0e-d77d-4a83-b8c4-d35c237ba7cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba4f8c0e-d77d-4a83-b8c4-d35c237ba7cc
Content-Type: application/json

--- request body ---
{"handle":"qa-aaf8b3c07f65","password":"****"}

--- response: 200 in 61 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba4f8c0e-d77d-4a83-b8c4-d35c237ba7cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba18b4d1-04ad-4b32-88dc-c49cc3a5d645"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d2a552f1-6ae1-4c80-8ea2-3a2ca6a8eec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2a552f1-6ae1-4c80-8ea2-3a2ca6a8eec9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2a33d8de237a","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2a552f1-6ae1-4c80-8ea2-3a2ca6a8eec9
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
Location: /v1/conversations/cnv_5a157c7f-8a38-422f-93ef-605ca205bd81
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a157c7f-8a38-422f-93ef-605ca205bd81","subject":"Error contract","status":"open","region":"eu","participants":["qa-aaf8b3c07f65","qa-2a33d8de237a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.199812885Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5a157c7f-8a38-422f-93ef-605ca205bd81/messages
correlation: qa-8011b8bd-b4f7-4bb7-ace3-683d04e311d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8011b8bd-b4f7-4bb7-ace3-683d04e311d7
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8011b8bd-b4f7-4bb7-ace3-683d04e311d7
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_5a157c7f-8a38-422f-93ef-605ca205bd81/messages","correlationId":"qa-8011b8bd-b4f7-4bb7-ace3-683d04e311d7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fe9a19f9-bb73-45be-9383-52b61d47c6ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe9a19f9-bb73-45be-9383-52b61d47c6ad
Content-Type: application/json

--- request body ---
{"handle":"qa-2a33d8de237a","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe9a19f9-bb73-45be-9383-52b61d47c6ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc2c2667-3026-4787-b650-052d26d4c592"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82b8aa67-458d-4858-b684-a1adb5443918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82b8aa67-458d-4858-b684-a1adb5443918
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82b8aa67-458d-4858-b684-a1adb5443918
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
correlation: qa-e87dd49f-2070-48cb-b566-23589cd9d46f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e87dd49f-2070-48cb-b566-23589cd9d46f
Content-Type: application/json

--- request body ---
{"handle":"qa-2a33d8de237a","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e87dd49f-2070-48cb-b566-23589cd9d46f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e87dd49f-2070-48cb-b566-23589cd9d46f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f2f08e2-e1a3-473b-9cd1-c1348279b76d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f2f08e2-e1a3-473b-9cd1-c1348279b76d
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f2f08e2-e1a3-473b-9cd1-c1348279b76d
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
correlation: qa-f634938f-79da-4ff3-b3f3-f54dc63bb55a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f634938f-79da-4ff3-b3f3-f54dc63bb55a
Content-Type: application/json

--- request body ---
{"handle":"qa-aaf8b3c07f65","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f634938f-79da-4ff3-b3f3-f54dc63bb55a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f634938f-79da-4ff3-b3f3-f54dc63bb55a"}
```
