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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-70b642db-8994-4512-b30e-63b3e09068c6` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-90f8315c-7011-447e-8a40-6c985cd7c831` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-08133820-00b2-4991-a2d4-4a8043953df1` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-8f4be648-5523-4099-b80e-641dd29ba2b7` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 5 | `qa-012b3100-47e5-440a-8cd1-a70601ccb8ee` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-ef105ee0-d1ac-4d4a-946f-16115009e91f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a8ef6332-d1d0-46c6-ab86-422c7adc6ae2` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-80370f67-d9ef-433b-a568-fe6d338bb0c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-071dad75-8fe2-4120-a321-7a9619ea15c7` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-d8e97c40-deee-4193-82dd-6482931e2800` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70b642db-8994-4512-b30e-63b3e09068c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70b642db-8994-4512-b30e-63b3e09068c6
Content-Type: application/json

--- request body ---
{"handle":"qa-b63e4b89792d","displayName":"QA b63e4b89792d","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-70b642db-8994-4512-b30e-63b3e09068c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Location: /v1/accounts/qa-b63e4b89792d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7de404b2-204f-4006-9863-5ef00f97753d","handle":"qa-b63e4b89792d","displayName":"QA b63e4b89792d","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.673382174Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-90f8315c-7011-447e-8a40-6c985cd7c831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f8315c-7011-447e-8a40-6c985cd7c831
Content-Type: application/json

--- request body ---
{"handle":"qa-bce978293998","displayName":"QA bce978293998","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-90f8315c-7011-447e-8a40-6c985cd7c831
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Location: /v1/accounts/qa-bce978293998
X-Served-Region: eu
Content-Length: 181

{"id":"acc_615ee906-c531-4ab2-b676-70b77b969c88","handle":"qa-bce978293998","displayName":"QA bce978293998","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.711705553Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08133820-00b2-4991-a2d4-4a8043953df1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08133820-00b2-4991-a2d4-4a8043953df1
Content-Type: application/json

--- request body ---
{"handle":"qa-b63e4b89792d","password":"****"}

--- response: 200 in 61 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-08133820-00b2-4991-a2d4-4a8043953df1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7de404b2-204f-4006-9863-5ef00f97753d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8f4be648-5523-4099-b80e-641dd29ba2b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f4be648-5523-4099-b80e-641dd29ba2b7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bce978293998","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f4be648-5523-4099-b80e-641dd29ba2b7
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
Location: /v1/conversations/cnv_357fa04b-2dc6-4791-b4b5-349909de283f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_357fa04b-2dc6-4791-b4b5-349909de283f","subject":"Error contract","status":"open","region":"eu","participants":["qa-b63e4b89792d","qa-bce978293998"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.803538377Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_357fa04b-2dc6-4791-b4b5-349909de283f/messages
correlation: qa-012b3100-47e5-440a-8cd1-a70601ccb8ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-012b3100-47e5-440a-8cd1-a70601ccb8ee
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-012b3100-47e5-440a-8cd1-a70601ccb8ee
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_357fa04b-2dc6-4791-b4b5-349909de283f/messages","correlationId":"qa-012b3100-47e5-440a-8cd1-a70601ccb8ee"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ef105ee0-d1ac-4d4a-946f-16115009e91f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef105ee0-d1ac-4d4a-946f-16115009e91f
Content-Type: application/json

--- request body ---
{"handle":"qa-bce978293998","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef105ee0-d1ac-4d4a-946f-16115009e91f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_615ee906-c531-4ab2-b676-70b77b969c88"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8ef6332-d1d0-46c6-ab86-422c7adc6ae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ef6332-d1d0-46c6-ab86-422c7adc6ae2
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8ef6332-d1d0-46c6-ab86-422c7adc6ae2
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
correlation: qa-80370f67-d9ef-433b-a568-fe6d338bb0c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80370f67-d9ef-433b-a568-fe6d338bb0c5
Content-Type: application/json

--- request body ---
{"handle":"qa-bce978293998","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80370f67-d9ef-433b-a568-fe6d338bb0c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80370f67-d9ef-433b-a568-fe6d338bb0c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-071dad75-8fe2-4120-a321-7a9619ea15c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-071dad75-8fe2-4120-a321-7a9619ea15c7
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-071dad75-8fe2-4120-a321-7a9619ea15c7
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
correlation: qa-d8e97c40-deee-4193-82dd-6482931e2800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8e97c40-deee-4193-82dd-6482931e2800
Content-Type: application/json

--- request body ---
{"handle":"qa-b63e4b89792d","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8e97c40-deee-4193-82dd-6482931e2800
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8e97c40-deee-4193-82dd-6482931e2800"}
```
