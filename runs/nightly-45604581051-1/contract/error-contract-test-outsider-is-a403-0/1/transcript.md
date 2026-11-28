# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-aecf5cd5-3d6d-4aac-9606-fd4f6a606e00` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-ad77abde-2d9e-4d6c-9c64-079fa53bce28` |
| 3 | `POST /v1/accounts` | 201 | 10 | `qa-4312f79b-f413-4f0d-9d66-2d78b5744cf7` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-24618e54-34f1-47bc-8c56-72d4a3d2f31a` |
| 5 | `POST /v1/conversations` | 201 | 11 | `qa-b33cd80a-7421-479c-9662-1d147dd6c2b2` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-e96c80b4-2c78-4834-ac59-61aab368f6ad` |
| 7 | `GET /v1/conversations/{id}` | 403 | 30 | `qa-4e9d4d48-51a5-4e3e-84bd-a282ffeb663a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-5d426350-0dc3-468c-ad5c-dfb82976610c` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-514555db-5da1-4c77-b9ae-5c5c4de713f8` |
| 10 | `POST /v1/auth/token` | 200 | 68 | `qa-eb74df8a-9057-42bf-bcb6-25d032c15b3f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-a440737d-9833-48c4-81b5-53af096b3899` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-855147c7-128b-4099-bc26-23287e59c79d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-11d45b9f-6ade-4e49-80c4-e1a7b78db4e7` |
| 14 | `POST /v1/auth/token` | 401 | 20 | `qa-73b94e83-be0b-46a1-bab7-d104724dc956` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aecf5cd5-3d6d-4aac-9606-fd4f6a606e00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aecf5cd5-3d6d-4aac-9606-fd4f6a606e00
Content-Type: application/json

--- request body ---
{"handle":"qa-4869dd9e88e7","displayName":"QA 4869dd9e88e7","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-aecf5cd5-3d6d-4aac-9606-fd4f6a606e00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Location: /v1/accounts/qa-4869dd9e88e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d2fc54e0-84bc-4b92-b79c-be1e4e1f0b33","handle":"qa-4869dd9e88e7","displayName":"QA 4869dd9e88e7","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.324192341Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ad77abde-2d9e-4d6c-9c64-079fa53bce28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad77abde-2d9e-4d6c-9c64-079fa53bce28
Content-Type: application/json

--- request body ---
{"handle":"qa-19e60a0e4b37","displayName":"QA 19e60a0e4b37","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad77abde-2d9e-4d6c-9c64-079fa53bce28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 10
Location: /v1/accounts/qa-19e60a0e4b37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2cb3139-e288-4646-8858-c0d08d1b2883","handle":"qa-19e60a0e4b37","displayName":"QA 19e60a0e4b37","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.371784054Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-4312f79b-f413-4f0d-9d66-2d78b5744cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4312f79b-f413-4f0d-9d66-2d78b5744cf7
Content-Type: application/json

--- request body ---
{"handle":"qa-3c041a616b65","displayName":"QA 3c041a616b65","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4312f79b-f413-4f0d-9d66-2d78b5744cf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-3c041a616b65
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed6f90aa-c84d-46af-9a73-adbe1ac3c67c","handle":"qa-3c041a616b65","displayName":"QA 3c041a616b65","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.391983999Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-24618e54-34f1-47bc-8c56-72d4a3d2f31a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24618e54-34f1-47bc-8c56-72d4a3d2f31a
Content-Type: application/json

--- request body ---
{"handle":"qa-4869dd9e88e7","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-24618e54-34f1-47bc-8c56-72d4a3d2f31a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d2fc54e0-84bc-4b92-b79c-be1e4e1f0b33"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b33cd80a-7421-479c-9662-1d147dd6c2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b33cd80a-7421-479c-9662-1d147dd6c2b2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-19e60a0e4b37","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b33cd80a-7421-479c-9662-1d147dd6c2b2
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
Location: /v1/conversations/cnv_0da752e3-10d4-456a-be1c-a9f078e422b3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0da752e3-10d4-456a-be1c-a9f078e422b3","subject":"Error contract","status":"open","region":"eu","participants":["qa-4869dd9e88e7","qa-19e60a0e4b37"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.461219956Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e96c80b4-2c78-4834-ac59-61aab368f6ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e96c80b4-2c78-4834-ac59-61aab368f6ad
Content-Type: application/json

--- request body ---
{"handle":"qa-3c041a616b65","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e96c80b4-2c78-4834-ac59-61aab368f6ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed6f90aa-c84d-46af-9a73-adbe1ac3c67c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0da752e3-10d4-456a-be1c-a9f078e422b3
correlation: qa-4e9d4d48-51a5-4e3e-84bd-a282ffeb663a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e9d4d48-51a5-4e3e-84bd-a282ffeb663a
Content-Type: application/json

--- response: 403 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e9d4d48-51a5-4e3e-84bd-a282ffeb663a
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0da752e3-10d4-456a-be1c-a9f078e422b3","correlationId":"qa-4e9d4d48-51a5-4e3e-84bd-a282ffeb663a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d426350-0dc3-468c-ad5c-dfb82976610c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d426350-0dc3-468c-ad5c-dfb82976610c
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d426350-0dc3-468c-ad5c-dfb82976610c
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
correlation: qa-514555db-5da1-4c77-b9ae-5c5c4de713f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-514555db-5da1-4c77-b9ae-5c5c4de713f8
Content-Type: application/json

--- request body ---
{"handle":"qa-3c041a616b65","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-514555db-5da1-4c77-b9ae-5c5c4de713f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-514555db-5da1-4c77-b9ae-5c5c4de713f8"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-eb74df8a-9057-42bf-bcb6-25d032c15b3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb74df8a-9057-42bf-bcb6-25d032c15b3f
Content-Type: application/json

--- request body ---
{"handle":"qa-19e60a0e4b37","password":"****"}

--- response: 200 in 68 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb74df8a-9057-42bf-bcb6-25d032c15b3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2cb3139-e288-4646-8858-c0d08d1b2883"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a440737d-9833-48c4-81b5-53af096b3899

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a440737d-9833-48c4-81b5-53af096b3899
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a440737d-9833-48c4-81b5-53af096b3899
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
correlation: qa-855147c7-128b-4099-bc26-23287e59c79d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-855147c7-128b-4099-bc26-23287e59c79d
Content-Type: application/json

--- request body ---
{"handle":"qa-19e60a0e4b37","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-855147c7-128b-4099-bc26-23287e59c79d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-855147c7-128b-4099-bc26-23287e59c79d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11d45b9f-6ade-4e49-80c4-e1a7b78db4e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11d45b9f-6ade-4e49-80c4-e1a7b78db4e7
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11d45b9f-6ade-4e49-80c4-e1a7b78db4e7
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
correlation: qa-73b94e83-be0b-46a1-bab7-d104724dc956

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b94e83-be0b-46a1-bab7-d104724dc956
Content-Type: application/json

--- request body ---
{"handle":"qa-4869dd9e88e7","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73b94e83-be0b-46a1-bab7-d104724dc956
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73b94e83-be0b-46a1-bab7-d104724dc956"}
```
