# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-e1b695c1-a383-4a21-ab0e-00f9c5ab1fe0` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-d6cc9fe4-8709-4568-8eed-ab7b78e9d0c4` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-932a074b-c259-4890-aba7-20a4b92e87fe` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-f10225de-2afb-4b0e-9667-c802e24fd075` |
| 5 | `POST /v1/accounts` | 400 | 18 | `qa-c04a0662-af6a-466f-9e80-5e2d52a69e9e` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-a75571c9-1ea3-4df2-bcf0-3876560c5ab8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-17612410-5684-4c1a-8bf3-40aa841d7014` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-d752a580-9ad1-4e27-9314-d85ca97c8c33` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a2c45009-b8a8-4380-bde7-ebd1436dbaf9` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-2b84e0f9-af6c-4a56-a220-ad1289342d38` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e1b695c1-a383-4a21-ab0e-00f9c5ab1fe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1b695c1-a383-4a21-ab0e-00f9c5ab1fe0
Content-Type: application/json

--- request body ---
{"handle":"qa-15a7cdb4036c","displayName":"QA 15a7cdb4036c","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1b695c1-a383-4a21-ab0e-00f9c5ab1fe0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-15a7cdb4036c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a0af531-bed6-4b34-beea-bb530d46ecff","handle":"qa-15a7cdb4036c","displayName":"QA 15a7cdb4036c","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.057310136Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d6cc9fe4-8709-4568-8eed-ab7b78e9d0c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6cc9fe4-8709-4568-8eed-ab7b78e9d0c4
Content-Type: application/json

--- request body ---
{"handle":"qa-a785d3f08628","displayName":"QA a785d3f08628","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6cc9fe4-8709-4568-8eed-ab7b78e9d0c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-a785d3f08628
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64afafb6-437e-488e-a36c-1e5e162601c1","handle":"qa-a785d3f08628","displayName":"QA a785d3f08628","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.103907345Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-932a074b-c259-4890-aba7-20a4b92e87fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-932a074b-c259-4890-aba7-20a4b92e87fe
Content-Type: application/json

--- request body ---
{"handle":"qa-15a7cdb4036c","password":"****"}

--- response: 200 in 61 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-932a074b-c259-4890-aba7-20a4b92e87fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a0af531-bed6-4b34-beea-bb530d46ecff"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f10225de-2afb-4b0e-9667-c802e24fd075

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f10225de-2afb-4b0e-9667-c802e24fd075
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a785d3f08628","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f10225de-2afb-4b0e-9667-c802e24fd075
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
Location: /v1/conversations/cnv_024d1717-5553-465c-83b8-291e30ce7099
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_024d1717-5553-465c-83b8-291e30ce7099","subject":"Error contract","status":"open","region":"eu","participants":["qa-15a7cdb4036c","qa-a785d3f08628"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.227935166Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c04a0662-af6a-466f-9e80-5e2d52a69e9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c04a0662-af6a-466f-9e80-5e2d52a69e9e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c04a0662-af6a-466f-9e80-5e2d52a69e9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-c04a0662-af6a-466f-9e80-5e2d52a69e9e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a75571c9-1ea3-4df2-bcf0-3876560c5ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a75571c9-1ea3-4df2-bcf0-3876560c5ab8
Content-Type: application/json

--- request body ---
{"handle":"qa-a785d3f08628","password":"****"}

--- response: 200 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a75571c9-1ea3-4df2-bcf0-3876560c5ab8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64afafb6-437e-488e-a36c-1e5e162601c1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17612410-5684-4c1a-8bf3-40aa841d7014

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17612410-5684-4c1a-8bf3-40aa841d7014
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17612410-5684-4c1a-8bf3-40aa841d7014
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
correlation: qa-d752a580-9ad1-4e27-9314-d85ca97c8c33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d752a580-9ad1-4e27-9314-d85ca97c8c33
Content-Type: application/json

--- request body ---
{"handle":"qa-a785d3f08628","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d752a580-9ad1-4e27-9314-d85ca97c8c33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d752a580-9ad1-4e27-9314-d85ca97c8c33"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2c45009-b8a8-4380-bde7-ebd1436dbaf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2c45009-b8a8-4380-bde7-ebd1436dbaf9
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2c45009-b8a8-4380-bde7-ebd1436dbaf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2b84e0f9-af6c-4a56-a220-ad1289342d38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b84e0f9-af6c-4a56-a220-ad1289342d38
Content-Type: application/json

--- request body ---
{"handle":"qa-15a7cdb4036c","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b84e0f9-af6c-4a56-a220-ad1289342d38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b84e0f9-af6c-4a56-a220-ad1289342d38"}
```
