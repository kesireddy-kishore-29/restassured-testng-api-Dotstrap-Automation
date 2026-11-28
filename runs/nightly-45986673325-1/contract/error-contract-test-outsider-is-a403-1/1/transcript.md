# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-3a475e62-fe9d-484e-9ae4-23f328d5a60d` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-b4fe421b-571d-43c5-bbb9-36287620a7a0` |
| 3 | `POST /v1/accounts` | 201 | 58 | `qa-146c5057-e942-4861-9540-a1cc85a503c8` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-b3e2e7c8-6aff-4953-924c-cb3406790890` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-dc0b7dcf-24d5-44cf-99d0-653213f49a52` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-76576e4b-b172-4086-9fd5-e47ad4c7683d` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 15 | `qa-f25d42fb-abb9-45ec-a0cf-6ed82f06b102` |
| 8 | `DELETE /v1/accounts/me` | 204 | 62 | `qa-e691d6e3-6f2d-4d8d-8590-4306b7a56597` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-e40642db-ff05-4f00-82ff-0d589d4e8941` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-2199c455-0712-4345-a7bc-f5d8508e7ef0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-6028496e-625f-4321-bb2c-523b5cef9c7c` |
| 12 | `POST /v1/auth/token` | 401 | 69 | `qa-29960fce-7cf6-4a0a-8117-3d08409516f8` |
| 13 | `DELETE /v1/accounts/me` | 204 | 85 | `qa-63a2d03d-818f-45eb-b5c2-13c82dec516d` |
| 14 | `POST /v1/auth/token` | 401 | 34 | `qa-80513495-d8bc-4b89-a13d-73173519f1a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a475e62-fe9d-484e-9ae4-23f328d5a60d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a475e62-fe9d-484e-9ae4-23f328d5a60d
Content-Type: application/json

--- request body ---
{"handle":"qa-9a90191fa139","displayName":"QA 9a90191fa139","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a475e62-fe9d-484e-9ae4-23f328d5a60d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-9a90191fa139
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a076ac7b-88e6-4c72-b777-78be811ea0e9","handle":"qa-9a90191fa139","displayName":"QA 9a90191fa139","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.015628428Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b4fe421b-571d-43c5-bbb9-36287620a7a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4fe421b-571d-43c5-bbb9-36287620a7a0
Content-Type: application/json

--- request body ---
{"handle":"qa-0285e8dd057c","displayName":"QA 0285e8dd057c","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4fe421b-571d-43c5-bbb9-36287620a7a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Location: /v1/accounts/qa-0285e8dd057c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65d24985-310a-4a7c-b9f2-3f90b7feeccb","handle":"qa-0285e8dd057c","displayName":"QA 0285e8dd057c","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.087788678Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-146c5057-e942-4861-9540-a1cc85a503c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-146c5057-e942-4861-9540-a1cc85a503c8
Content-Type: application/json

--- request body ---
{"handle":"qa-89e650ba2133","displayName":"QA 89e650ba2133","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-146c5057-e942-4861-9540-a1cc85a503c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-89e650ba2133
X-Served-Region: eu
Content-Length: 181

{"id":"acc_094de41f-846c-4a65-8ec4-99657c8e51d0","handle":"qa-89e650ba2133","displayName":"QA 89e650ba2133","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.155529429Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b3e2e7c8-6aff-4953-924c-cb3406790890

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3e2e7c8-6aff-4953-924c-cb3406790890
Content-Type: application/json

--- request body ---
{"handle":"qa-9a90191fa139","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3e2e7c8-6aff-4953-924c-cb3406790890
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a076ac7b-88e6-4c72-b777-78be811ea0e9"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-dc0b7dcf-24d5-44cf-99d0-653213f49a52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc0b7dcf-24d5-44cf-99d0-653213f49a52
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0285e8dd057c","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc0b7dcf-24d5-44cf-99d0-653213f49a52
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
Location: /v1/conversations/cnv_b7a999fa-eace-4623-9528-f647c87eec0a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b7a999fa-eace-4623-9528-f647c87eec0a","subject":"Error contract","status":"open","region":"eu","participants":["qa-9a90191fa139","qa-0285e8dd057c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.234629078Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-76576e4b-b172-4086-9fd5-e47ad4c7683d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76576e4b-b172-4086-9fd5-e47ad4c7683d
Content-Type: application/json

--- request body ---
{"handle":"qa-89e650ba2133","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-76576e4b-b172-4086-9fd5-e47ad4c7683d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_094de41f-846c-4a65-8ec4-99657c8e51d0"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b7a999fa-eace-4623-9528-f647c87eec0a/messages
correlation: qa-f25d42fb-abb9-45ec-a0cf-6ed82f06b102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f25d42fb-abb9-45ec-a0cf-6ed82f06b102
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f25d42fb-abb9-45ec-a0cf-6ed82f06b102
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b7a999fa-eace-4623-9528-f647c87eec0a/messages","correlationId":"qa-f25d42fb-abb9-45ec-a0cf-6ed82f06b102"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e691d6e3-6f2d-4d8d-8590-4306b7a56597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e691d6e3-6f2d-4d8d-8590-4306b7a56597
Content-Type: application/json

--- response: 204 in 62 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e691d6e3-6f2d-4d8d-8590-4306b7a56597
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-e40642db-ff05-4f00-82ff-0d589d4e8941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e40642db-ff05-4f00-82ff-0d589d4e8941
Content-Type: application/json

--- request body ---
{"handle":"qa-89e650ba2133","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e40642db-ff05-4f00-82ff-0d589d4e8941
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e40642db-ff05-4f00-82ff-0d589d4e8941"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2199c455-0712-4345-a7bc-f5d8508e7ef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2199c455-0712-4345-a7bc-f5d8508e7ef0
Content-Type: application/json

--- request body ---
{"handle":"qa-0285e8dd057c","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2199c455-0712-4345-a7bc-f5d8508e7ef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65d24985-310a-4a7c-b9f2-3f90b7feeccb"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6028496e-625f-4321-bb2c-523b5cef9c7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6028496e-625f-4321-bb2c-523b5cef9c7c
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6028496e-625f-4321-bb2c-523b5cef9c7c
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-29960fce-7cf6-4a0a-8117-3d08409516f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29960fce-7cf6-4a0a-8117-3d08409516f8
Content-Type: application/json

--- request body ---
{"handle":"qa-0285e8dd057c","password":"****"}

--- response: 401 in 69 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29960fce-7cf6-4a0a-8117-3d08409516f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29960fce-7cf6-4a0a-8117-3d08409516f8"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63a2d03d-818f-45eb-b5c2-13c82dec516d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63a2d03d-818f-45eb-b5c2-13c82dec516d
Content-Type: application/json

--- response: 204 in 85 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63a2d03d-818f-45eb-b5c2-13c82dec516d
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-80513495-d8bc-4b89-a13d-73173519f1a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80513495-d8bc-4b89-a13d-73173519f1a1
Content-Type: application/json

--- request body ---
{"handle":"qa-9a90191fa139","password":"****"}

--- response: 401 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80513495-d8bc-4b89-a13d-73173519f1a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80513495-d8bc-4b89-a13d-73173519f1a1"}
```
