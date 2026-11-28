# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-9efc180a-e7f0-48f4-93c5-b1309a082750` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-3f7a2921-0131-4d83-94c4-bc27f6d201be` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-57e9c829-b22d-41b5-b429-f54601ecc9cb` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-f4c14bba-973c-4009-bf98-6b4c78e767a9` |
| 5 | `POST /v1/auth/token` | 422 | 30 | `qa-0fa1d6d7-d22d-4a4f-b8bc-277b43250efa` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-616c6590-c843-4f9a-884a-df4480232de4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-04c6fd95-e166-4614-8f27-a125376a8d5d` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-c0cf5fb1-ffcf-4aa1-989a-2f70c5812e3b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-b3686275-4ad6-4c60-852d-aa84e39c5cdb` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-f2ba89cf-2c30-418c-bb27-c02666db6e48` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9efc180a-e7f0-48f4-93c5-b1309a082750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9efc180a-e7f0-48f4-93c5-b1309a082750
Content-Type: application/json

--- request body ---
{"handle":"qa-54df625f2614","displayName":"QA 54df625f2614","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9efc180a-e7f0-48f4-93c5-b1309a082750
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-54df625f2614
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55e6b5a7-a41f-4bae-8b3c-147fae7735df","handle":"qa-54df625f2614","displayName":"QA 54df625f2614","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.638576261Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3f7a2921-0131-4d83-94c4-bc27f6d201be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f7a2921-0131-4d83-94c4-bc27f6d201be
Content-Type: application/json

--- request body ---
{"handle":"qa-8b5e9549fd68","displayName":"QA 8b5e9549fd68","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f7a2921-0131-4d83-94c4-bc27f6d201be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-8b5e9549fd68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9462417c-3306-44b8-91f7-fd04ead0194e","handle":"qa-8b5e9549fd68","displayName":"QA 8b5e9549fd68","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.684349370Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-57e9c829-b22d-41b5-b429-f54601ecc9cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57e9c829-b22d-41b5-b429-f54601ecc9cb
Content-Type: application/json

--- request body ---
{"handle":"qa-54df625f2614","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-57e9c829-b22d-41b5-b429-f54601ecc9cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55e6b5a7-a41f-4bae-8b3c-147fae7735df"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f4c14bba-973c-4009-bf98-6b4c78e767a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4c14bba-973c-4009-bf98-6b4c78e767a9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8b5e9549fd68","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4c14bba-973c-4009-bf98-6b4c78e767a9
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
Location: /v1/conversations/cnv_bd17a8ac-8038-4d00-9751-38506fc4872c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bd17a8ac-8038-4d00-9751-38506fc4872c","subject":"Error contract","status":"open","region":"eu","participants":["qa-54df625f2614","qa-8b5e9549fd68"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.709478984Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0fa1d6d7-d22d-4a4f-b8bc-277b43250efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fa1d6d7-d22d-4a4f-b8bc-277b43250efa
Content-Type: application/json

--- request body ---
{"handle":"qa-54df625f2614","password":"****","ttlSeconds":0}

--- response: 422 in 30 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fa1d6d7-d22d-4a4f-b8bc-277b43250efa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-0fa1d6d7-d22d-4a4f-b8bc-277b43250efa","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-616c6590-c843-4f9a-884a-df4480232de4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-616c6590-c843-4f9a-884a-df4480232de4
Content-Type: application/json

--- request body ---
{"handle":"qa-8b5e9549fd68","password":"****"}

--- response: 200 in 60 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-616c6590-c843-4f9a-884a-df4480232de4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9462417c-3306-44b8-91f7-fd04ead0194e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04c6fd95-e166-4614-8f27-a125376a8d5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04c6fd95-e166-4614-8f27-a125376a8d5d
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04c6fd95-e166-4614-8f27-a125376a8d5d
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
correlation: qa-c0cf5fb1-ffcf-4aa1-989a-2f70c5812e3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0cf5fb1-ffcf-4aa1-989a-2f70c5812e3b
Content-Type: application/json

--- request body ---
{"handle":"qa-8b5e9549fd68","password":"****"}

--- response: 401 in 33 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0cf5fb1-ffcf-4aa1-989a-2f70c5812e3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0cf5fb1-ffcf-4aa1-989a-2f70c5812e3b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3686275-4ad6-4c60-852d-aa84e39c5cdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3686275-4ad6-4c60-852d-aa84e39c5cdb
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3686275-4ad6-4c60-852d-aa84e39c5cdb
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
correlation: qa-f2ba89cf-2c30-418c-bb27-c02666db6e48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2ba89cf-2c30-418c-bb27-c02666db6e48
Content-Type: application/json

--- request body ---
{"handle":"qa-54df625f2614","password":"****"}

--- response: 401 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2ba89cf-2c30-418c-bb27-c02666db6e48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2ba89cf-2c30-418c-bb27-c02666db6e48"}
```
