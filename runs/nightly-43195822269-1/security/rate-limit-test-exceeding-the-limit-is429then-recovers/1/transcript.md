# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 353 | `qa-10309d48-65c4-446c-83de-13a1bdc877ea` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-01046b3e-3abf-45c3-8032-c290b424bef1` |
| 3 | `GET /v1/accounts/me` | 200 | 49 | `qa-7deef2f5-1720-4464-9604-74079c4a3854` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-596418e5-8a10-4332-82b4-acd4f5daab8f` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-00b9e6f9-be99-4a27-8f19-a0af09c4de89` |
| 6 | `GET /v1/accounts/me` | 200 | 21 | `qa-cf4ab016-5564-43e4-af52-c38727e841f0` |
| 7 | `GET /v1/accounts/me` | 200 | 19 | `qa-e7d2ff85-72c8-4609-b64e-9d65f66a09fc` |
| 8 | `GET /v1/accounts/me` | 200 | 9 | `qa-bb967320-68d0-4df4-b6ad-e21b8b9252b5` |
| 9 | `GET /v1/accounts/me` | 200 | 11 | `qa-881e4b6d-9601-418e-9d9d-e80bed642b87` |
| 10 | `GET /v1/accounts/me` | 200 | 11 | `qa-6c74a181-15ce-4c94-a1b7-a0136d190731` |
| 11 | `GET /v1/accounts/me` | 200 | 9 | `qa-acf4c16a-6a20-4f30-a6d1-237ed6292c60` |
| 12 | `GET /v1/accounts/me` | 200 | 8 | `qa-b8d24ba3-33be-4f73-9f52-04ccbfc6985a` |
| 13 | `GET /v1/accounts/me` | 200 | 15 | `qa-93190e04-b7b9-48f7-9a24-b235d8b91494` |
| 14 | `GET /v1/accounts/me` | 200 | 9 | `qa-287e9a01-293b-4635-817b-86456451f46d` |
| 15 | `GET /v1/accounts/me` | 200 | 8 | `qa-81dbbfde-56df-4453-ac60-2463cca9c59e` |
| 16 | `GET /v1/accounts/me` | 200 | 9 | `qa-8fbcb009-5b73-4c1f-9386-baa8b43cf9a7` |
| 17 | `GET /v1/accounts/me` | 200 | 9 | `qa-da30f571-4fc9-49ba-8ec1-02d810c2d090` |
| 18 | `GET /v1/accounts/me` | 200 | 11 | `qa-881cdc13-16c6-4c64-b7cf-af561f9a5028` |
| 19 | `GET /v1/accounts/me` | 200 | 7 | `qa-27d764d9-c0ab-4829-ad46-0da992af24a4` |
| 20 | `GET /v1/accounts/me` | 200 | 7 | `qa-745a4113-ddda-430e-ad0d-346afb582cc0` |
| 21 | `GET /v1/accounts/me` | 200 | 10 | `qa-787640e0-e4c5-425e-b6cf-50652958c335` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-dffe392c-2744-46f0-9bfe-40636ccc567c` |
| 23 | `GET /v1/accounts/me` | 200 | 7 | `qa-bfca4817-f201-4bdd-a083-9c2040e1f70b` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-8ad599f8-908b-41ab-b5c9-f47d0fc5697d` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-92863bd3-b7b2-49f6-b186-ebe6e7c710b9` |
| 26 | `GET /v1/accounts/me` | 200 | 9 | `qa-cc1b69cb-6523-4265-83b9-42ce0b668f18` |
| 27 | `GET /v1/accounts/me` | 200 | 6 | `qa-0e1f2e38-e2c6-44bc-956a-fb537c3cc3c7` |
| 28 | `GET /v1/accounts/me` | 200 | 7 | `qa-31a066c4-ccb8-48ce-b466-65873a0f868e` |
| 29 | `GET /v1/accounts/me` | 200 | 10 | `qa-afd71df2-51f0-42a4-89c5-b25a13d3ebbc` |
| 30 | `GET /v1/accounts/me` | 200 | 5 | `qa-8b2df45a-a59b-44e5-9196-5f1ab879d6a4` |
| 31 | `GET /v1/accounts/me` | 200 | 5 | `qa-04d487fd-c331-4e91-8a23-2c698f3c3282` |
| 32 | `GET /v1/accounts/me` | 200 | 8 | `qa-387dcefe-ec83-46fc-83cb-f194d2516000` |
| 33 | `GET /v1/accounts/me` | 200 | 7 | `qa-41ac8dc6-7238-44ca-8e67-848419a0a9aa` |
| 34 | `GET /v1/accounts/me` | 200 | 22 | `qa-d6ea9271-7d22-41e6-ad15-62bef7a3e245` |
| 35 | `GET /v1/accounts/me` | 200 | 9 | `qa-9b24e12a-9afc-4ef3-9cf4-f7186f042422` |
| 36 | `GET /v1/accounts/me` | 200 | 9 | `qa-8929e77f-0360-47aa-8de2-0008430c28aa` |
| 37 | `GET /v1/accounts/me` | 200 | 6 | `qa-2edd6f76-b12e-4d2f-a596-1f7cb47085d5` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-c82f02f3-71d6-48cd-897d-ea6e6747d8d7` |
| 39 | `GET /v1/accounts/me` | 200 | 8 | `qa-ed9ed2fe-50e0-4c27-8f71-87e38153e449` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-08bacfda-f44c-4d2b-910d-a97d83370265` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-daffa6d0-0e47-4491-95df-ef5f84973a5e` |
| 42 | `GET /v1/accounts/me` | 200 | 5 | `qa-0017dbdd-ca5e-4dbf-9730-7f1b428f4dba` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-7dfaa4fd-38f5-4c8a-bfe1-47b2e864cbfe` |
| 44 | `GET /v1/accounts/me` | 200 | 8 | `qa-b236d9c4-f827-4ccf-87ff-46ed21510d7b` |
| 45 | `GET /v1/accounts/me` | 200 | 8 | `qa-76f44d0f-e319-4955-8c47-26486e97509d` |
| 46 | `GET /v1/accounts/me` | 200 | 11 | `qa-761c758b-e7bf-4601-9603-3a5d4547d2f9` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-2b4a030c-c141-47aa-9a7a-88ccb95c3604` |
| 48 | `GET /v1/accounts/me` | 200 | 13 | `qa-96aeb427-4f92-4338-8e5a-7365be8647ad` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-a293eddf-cf68-4fe1-aefe-ae30a029ba3c` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-a74fec79-296a-48b4-aff2-1d98b892d4d0` |
| 51 | `GET /v1/accounts/me` | 200 | 8 | `qa-c004d5db-eac3-4031-92e4-e0ecc35d5623` |
| 52 | `GET /v1/accounts/me` | 200 | 15 | `qa-cd0cfb6a-3470-44ec-90b0-788dd8b0b9be` |
| 53 | `GET /v1/accounts/me` | 200 | 11 | `qa-db1b5bd1-a9fe-48e5-abfb-c4713dc5d2db` |
| 54 | `GET /v1/accounts/me` | 200 | 8 | `qa-8b4cc1d7-36a1-4b7d-aa58-363440cd9272` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-8e24a14f-c790-4eaa-8dac-388a8689e344` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-8b00eb06-51e9-43e5-8019-79592e9387f1` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-1a74888e-32ae-4493-b2cd-1cfac08c97bb` |
| 58 | `GET /v1/accounts/me` | 200 | 6 | `qa-82303118-5f52-4c53-ab4f-58aa9f566769` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-cae56b63-3905-4f43-a80e-c14d567fcd62` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-e9e3a524-b61f-441d-9ed7-e4ebb340193b` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-79095bb3-8947-43e7-b95c-188ba380e81b` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-e15ef9a9-bfbe-4335-8fe2-eff0d322ca38` |
| 63 | `GET /v1/accounts/me` | 429 | 11 | `qa-b3669306-8ac7-4af8-903f-22241a62e024` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-e8c079b3-7e6c-43a7-8c11-3478993bb27d` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-9327f461-59d7-41fd-b840-43d8f95534c6` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-57eef795-b72c-4b2b-bb86-5bef8575e952` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-a9a88ec5-eb2f-4b59-b82e-d62195d26b34` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-8ba399ce-5644-4c0f-8b32-c8a8848d9edc` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-ea5d4ad1-bbdf-4da8-964d-ad1a79718e87` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-3fabb27e-91a1-405b-85f5-1bb2de217a3d` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-c773f02e-5a54-46d5-8fee-9f2d0810bc65` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-8a6ffc21-4687-48c1-98c9-2d3a89266d62` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-fc717aea-d62f-4494-8f9e-4bf08914aa06` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-aeb98b59-151e-4b51-995d-70311859bc95` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-afe16d64-9659-4f67-9609-2b198ed6eb9d` |
| 76 | `GET /v1/accounts/me` | 429 | 3 | `qa-a6aec51a-3d1c-4842-b154-6ee1ff8cb2bd` |
| 77 | `GET /v1/accounts/me` | 429 | 3 | `qa-586aa022-3062-4fe2-b2b2-5674ac45cc52` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-0e1a6b95-7cc2-4f1e-a742-5fc935434b56` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-503a7b2b-1659-42c0-a6ee-addf8f2e3539` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-747b5a88-1f7b-4bc2-8cdd-5908aa1f5acc` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-4236c384-a47a-4e94-bdc2-d556a005e722` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-4d86999c-6726-4ecd-8dd6-e8a603e8eed1` |
| 83 | `POST /v1/auth/token` | 401 | 4 | `qa-c74b45a0-c971-4db7-8d58-f1154423958b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-10309d48-65c4-446c-83de-13a1bdc877ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10309d48-65c4-446c-83de-13a1bdc877ea
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","password":"****","region":"eu"}

--- response: 201 in 353 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-10309d48-65c4-446c-83de-13a1bdc877ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-8e8af2bfe83e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-01046b3e-3abf-45c3-8032-c290b424bef1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01046b3e-3abf-45c3-8032-c290b424bef1
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8af2bfe83e","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-01046b3e-3abf-45c3-8032-c290b424bef1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7deef2f5-1720-4464-9604-74079c4a3854

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7deef2f5-1720-4464-9604-74079c4a3854
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7deef2f5-1720-4464-9604-74079c4a3854
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
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-596418e5-8a10-4332-82b4-acd4f5daab8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-596418e5-8a10-4332-82b4-acd4f5daab8f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-596418e5-8a10-4332-82b4-acd4f5daab8f
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
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-00b9e6f9-be99-4a27-8f19-a0af09c4de89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00b9e6f9-be99-4a27-8f19-a0af09c4de89
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-00b9e6f9-be99-4a27-8f19-a0af09c4de89
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
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf4ab016-5564-43e4-af52-c38727e841f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf4ab016-5564-43e4-af52-c38727e841f0
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf4ab016-5564-43e4-af52-c38727e841f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7d2ff85-72c8-4609-b64e-9d65f66a09fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7d2ff85-72c8-4609-b64e-9d65f66a09fc
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7d2ff85-72c8-4609-b64e-9d65f66a09fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb967320-68d0-4df4-b6ad-e21b8b9252b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb967320-68d0-4df4-b6ad-e21b8b9252b5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb967320-68d0-4df4-b6ad-e21b8b9252b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-881e4b6d-9601-418e-9d9d-e80bed642b87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-881e4b6d-9601-418e-9d9d-e80bed642b87
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-881e4b6d-9601-418e-9d9d-e80bed642b87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c74a181-15ce-4c94-a1b7-a0136d190731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c74a181-15ce-4c94-a1b7-a0136d190731
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c74a181-15ce-4c94-a1b7-a0136d190731
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-acf4c16a-6a20-4f30-a6d1-237ed6292c60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acf4c16a-6a20-4f30-a6d1-237ed6292c60
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-acf4c16a-6a20-4f30-a6d1-237ed6292c60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8d24ba3-33be-4f73-9f52-04ccbfc6985a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8d24ba3-33be-4f73-9f52-04ccbfc6985a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8d24ba3-33be-4f73-9f52-04ccbfc6985a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-93190e04-b7b9-48f7-9a24-b235d8b91494

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93190e04-b7b9-48f7-9a24-b235d8b91494
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-93190e04-b7b9-48f7-9a24-b235d8b91494
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-287e9a01-293b-4635-817b-86456451f46d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-287e9a01-293b-4635-817b-86456451f46d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-287e9a01-293b-4635-817b-86456451f46d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-81dbbfde-56df-4453-ac60-2463cca9c59e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81dbbfde-56df-4453-ac60-2463cca9c59e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-81dbbfde-56df-4453-ac60-2463cca9c59e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-8fbcb009-5b73-4c1f-9386-baa8b43cf9a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fbcb009-5b73-4c1f-9386-baa8b43cf9a7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fbcb009-5b73-4c1f-9386-baa8b43cf9a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-da30f571-4fc9-49ba-8ec1-02d810c2d090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da30f571-4fc9-49ba-8ec1-02d810c2d090
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-da30f571-4fc9-49ba-8ec1-02d810c2d090
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-881cdc13-16c6-4c64-b7cf-af561f9a5028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-881cdc13-16c6-4c64-b7cf-af561f9a5028
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-881cdc13-16c6-4c64-b7cf-af561f9a5028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-27d764d9-c0ab-4829-ad46-0da992af24a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27d764d9-c0ab-4829-ad46-0da992af24a4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-27d764d9-c0ab-4829-ad46-0da992af24a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-745a4113-ddda-430e-ad0d-346afb582cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745a4113-ddda-430e-ad0d-346afb582cc0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-745a4113-ddda-430e-ad0d-346afb582cc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-787640e0-e4c5-425e-b6cf-50652958c335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-787640e0-e4c5-425e-b6cf-50652958c335
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-787640e0-e4c5-425e-b6cf-50652958c335
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-dffe392c-2744-46f0-9bfe-40636ccc567c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dffe392c-2744-46f0-9bfe-40636ccc567c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-dffe392c-2744-46f0-9bfe-40636ccc567c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfca4817-f201-4bdd-a083-9c2040e1f70b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfca4817-f201-4bdd-a083-9c2040e1f70b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfca4817-f201-4bdd-a083-9c2040e1f70b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ad599f8-908b-41ab-b5c9-f47d0fc5697d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad599f8-908b-41ab-b5c9-f47d0fc5697d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad599f8-908b-41ab-b5c9-f47d0fc5697d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-92863bd3-b7b2-49f6-b186-ebe6e7c710b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92863bd3-b7b2-49f6-b186-ebe6e7c710b9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-92863bd3-b7b2-49f6-b186-ebe6e7c710b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc1b69cb-6523-4265-83b9-42ce0b668f18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc1b69cb-6523-4265-83b9-42ce0b668f18
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc1b69cb-6523-4265-83b9-42ce0b668f18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e1f2e38-e2c6-44bc-956a-fb537c3cc3c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e1f2e38-e2c6-44bc-956a-fb537c3cc3c7
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e1f2e38-e2c6-44bc-956a-fb537c3cc3c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-31a066c4-ccb8-48ce-b466-65873a0f868e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a066c4-ccb8-48ce-b466-65873a0f868e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-31a066c4-ccb8-48ce-b466-65873a0f868e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-afd71df2-51f0-42a4-89c5-b25a13d3ebbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd71df2-51f0-42a4-89c5-b25a13d3ebbc
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd71df2-51f0-42a4-89c5-b25a13d3ebbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b2df45a-a59b-44e5-9196-5f1ab879d6a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b2df45a-a59b-44e5-9196-5f1ab879d6a4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b2df45a-a59b-44e5-9196-5f1ab879d6a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-04d487fd-c331-4e91-8a23-2c698f3c3282

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04d487fd-c331-4e91-8a23-2c698f3c3282
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-04d487fd-c331-4e91-8a23-2c698f3c3282
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-387dcefe-ec83-46fc-83cb-f194d2516000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387dcefe-ec83-46fc-83cb-f194d2516000
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-387dcefe-ec83-46fc-83cb-f194d2516000
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-41ac8dc6-7238-44ca-8e67-848419a0a9aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41ac8dc6-7238-44ca-8e67-848419a0a9aa
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-41ac8dc6-7238-44ca-8e67-848419a0a9aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6ea9271-7d22-41e6-ad15-62bef7a3e245

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6ea9271-7d22-41e6-ad15-62bef7a3e245
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6ea9271-7d22-41e6-ad15-62bef7a3e245
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b24e12a-9afc-4ef3-9cf4-f7186f042422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b24e12a-9afc-4ef3-9cf4-f7186f042422
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b24e12a-9afc-4ef3-9cf4-f7186f042422
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-8929e77f-0360-47aa-8de2-0008430c28aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8929e77f-0360-47aa-8de2-0008430c28aa
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8929e77f-0360-47aa-8de2-0008430c28aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-2edd6f76-b12e-4d2f-a596-1f7cb47085d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2edd6f76-b12e-4d2f-a596-1f7cb47085d5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2edd6f76-b12e-4d2f-a596-1f7cb47085d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-c82f02f3-71d6-48cd-897d-ea6e6747d8d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c82f02f3-71d6-48cd-897d-ea6e6747d8d7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c82f02f3-71d6-48cd-897d-ea6e6747d8d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed9ed2fe-50e0-4c27-8f71-87e38153e449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed9ed2fe-50e0-4c27-8f71-87e38153e449
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed9ed2fe-50e0-4c27-8f71-87e38153e449
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-08bacfda-f44c-4d2b-910d-a97d83370265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08bacfda-f44c-4d2b-910d-a97d83370265
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-08bacfda-f44c-4d2b-910d-a97d83370265
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-daffa6d0-0e47-4491-95df-ef5f84973a5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daffa6d0-0e47-4491-95df-ef5f84973a5e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-daffa6d0-0e47-4491-95df-ef5f84973a5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-0017dbdd-ca5e-4dbf-9730-7f1b428f4dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0017dbdd-ca5e-4dbf-9730-7f1b428f4dba
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0017dbdd-ca5e-4dbf-9730-7f1b428f4dba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-7dfaa4fd-38f5-4c8a-bfe1-47b2e864cbfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dfaa4fd-38f5-4c8a-bfe1-47b2e864cbfe
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dfaa4fd-38f5-4c8a-bfe1-47b2e864cbfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-b236d9c4-f827-4ccf-87ff-46ed21510d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b236d9c4-f827-4ccf-87ff-46ed21510d7b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b236d9c4-f827-4ccf-87ff-46ed21510d7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-76f44d0f-e319-4955-8c47-26486e97509d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76f44d0f-e319-4955-8c47-26486e97509d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-76f44d0f-e319-4955-8c47-26486e97509d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-761c758b-e7bf-4601-9603-3a5d4547d2f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-761c758b-e7bf-4601-9603-3a5d4547d2f9
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-761c758b-e7bf-4601-9603-3a5d4547d2f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b4a030c-c141-47aa-9a7a-88ccb95c3604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b4a030c-c141-47aa-9a7a-88ccb95c3604
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b4a030c-c141-47aa-9a7a-88ccb95c3604
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-96aeb427-4f92-4338-8e5a-7365be8647ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96aeb427-4f92-4338-8e5a-7365be8647ad
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-96aeb427-4f92-4338-8e5a-7365be8647ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-a293eddf-cf68-4fe1-aefe-ae30a029ba3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a293eddf-cf68-4fe1-aefe-ae30a029ba3c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a293eddf-cf68-4fe1-aefe-ae30a029ba3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-a74fec79-296a-48b4-aff2-1d98b892d4d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a74fec79-296a-48b4-aff2-1d98b892d4d0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a74fec79-296a-48b4-aff2-1d98b892d4d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-c004d5db-eac3-4031-92e4-e0ecc35d5623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c004d5db-eac3-4031-92e4-e0ecc35d5623
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c004d5db-eac3-4031-92e4-e0ecc35d5623
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd0cfb6a-3470-44ec-90b0-788dd8b0b9be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd0cfb6a-3470-44ec-90b0-788dd8b0b9be
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd0cfb6a-3470-44ec-90b0-788dd8b0b9be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-db1b5bd1-a9fe-48e5-abfb-c4713dc5d2db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db1b5bd1-a9fe-48e5-abfb-c4713dc5d2db
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-db1b5bd1-a9fe-48e5-abfb-c4713dc5d2db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b4cc1d7-36a1-4b7d-aa58-363440cd9272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4cc1d7-36a1-4b7d-aa58-363440cd9272
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b4cc1d7-36a1-4b7d-aa58-363440cd9272
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e24a14f-c790-4eaa-8dac-388a8689e344

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e24a14f-c790-4eaa-8dac-388a8689e344
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e24a14f-c790-4eaa-8dac-388a8689e344
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b00eb06-51e9-43e5-8019-79592e9387f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b00eb06-51e9-43e5-8019-79592e9387f1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b00eb06-51e9-43e5-8019-79592e9387f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a74888e-32ae-4493-b2cd-1cfac08c97bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a74888e-32ae-4493-b2cd-1cfac08c97bb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a74888e-32ae-4493-b2cd-1cfac08c97bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-82303118-5f52-4c53-ab4f-58aa9f566769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82303118-5f52-4c53-ab4f-58aa9f566769
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-82303118-5f52-4c53-ab4f-58aa9f566769
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-cae56b63-3905-4f43-a80e-c14d567fcd62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cae56b63-3905-4f43-a80e-c14d567fcd62
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cae56b63-3905-4f43-a80e-c14d567fcd62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9e3a524-b61f-441d-9ed7-e4ebb340193b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9e3a524-b61f-441d-9ed7-e4ebb340193b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9e3a524-b61f-441d-9ed7-e4ebb340193b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-79095bb3-8947-43e7-b95c-188ba380e81b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79095bb3-8947-43e7-b95c-188ba380e81b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-79095bb3-8947-43e7-b95c-188ba380e81b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-e15ef9a9-bfbe-4335-8fe2-eff0d322ca38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e15ef9a9-bfbe-4335-8fe2-eff0d322ca38
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e15ef9a9-bfbe-4335-8fe2-eff0d322ca38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3669306-8ac7-4af8-903f-22241a62e024

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3669306-8ac7-4af8-903f-22241a62e024
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3669306-8ac7-4af8-903f-22241a62e024
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b3669306-8ac7-4af8-903f-22241a62e024"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8c079b3-7e6c-43a7-8c11-3478993bb27d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8c079b3-7e6c-43a7-8c11-3478993bb27d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8c079b3-7e6c-43a7-8c11-3478993bb27d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e8c079b3-7e6c-43a7-8c11-3478993bb27d"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-9327f461-59d7-41fd-b840-43d8f95534c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9327f461-59d7-41fd-b840-43d8f95534c6
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9327f461-59d7-41fd-b840-43d8f95534c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9327f461-59d7-41fd-b840-43d8f95534c6"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-57eef795-b72c-4b2b-bb86-5bef8575e952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57eef795-b72c-4b2b-bb86-5bef8575e952
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57eef795-b72c-4b2b-bb86-5bef8575e952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-57eef795-b72c-4b2b-bb86-5bef8575e952"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9a88ec5-eb2f-4b59-b82e-d62195d26b34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9a88ec5-eb2f-4b59-b82e-d62195d26b34
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9a88ec5-eb2f-4b59-b82e-d62195d26b34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a9a88ec5-eb2f-4b59-b82e-d62195d26b34"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ba399ce-5644-4c0f-8b32-c8a8848d9edc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ba399ce-5644-4c0f-8b32-c8a8848d9edc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ba399ce-5644-4c0f-8b32-c8a8848d9edc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8ba399ce-5644-4c0f-8b32-c8a8848d9edc"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea5d4ad1-bbdf-4da8-964d-ad1a79718e87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea5d4ad1-bbdf-4da8-964d-ad1a79718e87
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea5d4ad1-bbdf-4da8-964d-ad1a79718e87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ea5d4ad1-bbdf-4da8-964d-ad1a79718e87"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-3fabb27e-91a1-405b-85f5-1bb2de217a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fabb27e-91a1-405b-85f5-1bb2de217a3d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fabb27e-91a1-405b-85f5-1bb2de217a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3fabb27e-91a1-405b-85f5-1bb2de217a3d"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-c773f02e-5a54-46d5-8fee-9f2d0810bc65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c773f02e-5a54-46d5-8fee-9f2d0810bc65
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c773f02e-5a54-46d5-8fee-9f2d0810bc65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c773f02e-5a54-46d5-8fee-9f2d0810bc65"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a6ffc21-4687-48c1-98c9-2d3a89266d62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a6ffc21-4687-48c1-98c9-2d3a89266d62
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a6ffc21-4687-48c1-98c9-2d3a89266d62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8a6ffc21-4687-48c1-98c9-2d3a89266d62"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc717aea-d62f-4494-8f9e-4bf08914aa06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc717aea-d62f-4494-8f9e-4bf08914aa06
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc717aea-d62f-4494-8f9e-4bf08914aa06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fc717aea-d62f-4494-8f9e-4bf08914aa06"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-aeb98b59-151e-4b51-995d-70311859bc95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeb98b59-151e-4b51-995d-70311859bc95
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aeb98b59-151e-4b51-995d-70311859bc95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-aeb98b59-151e-4b51-995d-70311859bc95"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-afe16d64-9659-4f67-9609-2b198ed6eb9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afe16d64-9659-4f67-9609-2b198ed6eb9d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afe16d64-9659-4f67-9609-2b198ed6eb9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-afe16d64-9659-4f67-9609-2b198ed6eb9d"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6aec51a-3d1c-4842-b154-6ee1ff8cb2bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6aec51a-3d1c-4842-b154-6ee1ff8cb2bd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6aec51a-3d1c-4842-b154-6ee1ff8cb2bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a6aec51a-3d1c-4842-b154-6ee1ff8cb2bd"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-586aa022-3062-4fe2-b2b2-5674ac45cc52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-586aa022-3062-4fe2-b2b2-5674ac45cc52
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-586aa022-3062-4fe2-b2b2-5674ac45cc52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-586aa022-3062-4fe2-b2b2-5674ac45cc52"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e1a6b95-7cc2-4f1e-a742-5fc935434b56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e1a6b95-7cc2-4f1e-a742-5fc935434b56
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e1a6b95-7cc2-4f1e-a742-5fc935434b56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0e1a6b95-7cc2-4f1e-a742-5fc935434b56"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-503a7b2b-1659-42c0-a6ee-addf8f2e3539

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-503a7b2b-1659-42c0-a6ee-addf8f2e3539
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-503a7b2b-1659-42c0-a6ee-addf8f2e3539
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-503a7b2b-1659-42c0-a6ee-addf8f2e3539"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-747b5a88-1f7b-4bc2-8cdd-5908aa1f5acc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-747b5a88-1f7b-4bc2-8cdd-5908aa1f5acc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-747b5a88-1f7b-4bc2-8cdd-5908aa1f5acc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-747b5a88-1f7b-4bc2-8cdd-5908aa1f5acc"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-4236c384-a47a-4e94-bdc2-d556a005e722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4236c384-a47a-4e94-bdc2-d556a005e722
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4236c384-a47a-4e94-bdc2-d556a005e722
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
Content-Length: 181

{"id":"acc_6e851f2d-452c-4c71-b9e9-20eec1c9d7ba","handle":"qa-8e8af2bfe83e","displayName":"QA 8e8af2bfe83e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:35.060894935Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d86999c-6726-4ecd-8dd6-e8a603e8eed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d86999c-6726-4ecd-8dd6-e8a603e8eed1
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d86999c-6726-4ecd-8dd6-e8a603e8eed1
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-c74b45a0-c971-4db7-8d58-f1154423958b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c74b45a0-c971-4db7-8d58-f1154423958b
Content-Type: application/json

--- request body ---
{"handle":"qa-8e8af2bfe83e","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c74b45a0-c971-4db7-8d58-f1154423958b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c74b45a0-c971-4db7-8d58-f1154423958b"}
```
